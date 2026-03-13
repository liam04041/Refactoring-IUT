public class Voiture {
    private String model;
    private String color;
    private int speed;

    public Voiture(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getVitesse() {
        return this.speed;
    }

    public void accelerer() {
        if (speed + 10 <= 120) {
            speed += 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (speed - 10 >= 0) {
            speed -= 10;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void demarrerVoiture(Conducteur conducteur) {
        if (conducteur.estAdulte()) {
            System.out.println(conducteur.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Conducteur conducteur) {
        System.out.println(conducteur.getName() + " arrête la voiture.");
    }

    public void changerVitesse(Conducteur conducteur, int nouvelleVitesse) {
        System.out.println(conducteur.getName() + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
        if (getVitesse() >= nouvelleVitesse) {
            while (getVitesse() > nouvelleVitesse && getVitesse() > 0) {
                ralentir();
            }
        } else  {
            while (getVitesse() < nouvelleVitesse && getVitesse() < 120) {
                accelerer();
            }
        }
        if (getVitesse() != nouvelleVitesse) {
            System.out.println("La vitesse cible est inategnable");
        }
    }
}

