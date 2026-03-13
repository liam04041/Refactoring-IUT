public class Car {
    public static final int VELOCITY_DELTA = 10;
    public static final int MINIMUM_SPEED = 0;
    public static final int MAXIMUM_SPEED = 120;
    private String model;
    private String color;
    private int speed;

    public Car(String m, String c) {
        this.model = m;
        this.color = c;
        this.speed = MINIMUM_SPEED;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp() {
        if (speed + VELOCITY_DELTA <= MAXIMUM_SPEED) {
            speed += VELOCITY_DELTA;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (speed - VELOCITY_DELTA >= MINIMUM_SPEED) {
            speed -= VELOCITY_DELTA;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void startCar(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Driver driver) {
        System.out.println(driver.getName() + " arrête la voiture.");
    }

    public void changeSpeed(Driver driver, int newSpeed) {
        System.out.println(driver.getName() + " change la vitesse de la voiture à " + newSpeed);
        int vitesseActuelle;
        if (getSpeed() >= newSpeed) {
            while (getSpeed() > newSpeed && getSpeed() > MINIMUM_SPEED) {
                slowDown();
            }
        } else  {
            while (getSpeed() < newSpeed && getSpeed() < MAXIMUM_SPEED) {
                speedUp();
            }
        }
        if (getSpeed() != newSpeed) {
            System.out.println("La vitesse cible est inategnable");
        }
    }
}

