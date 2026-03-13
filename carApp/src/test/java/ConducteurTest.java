import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Conducteur conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Conducteur("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(conducteur.estAdulte()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        voiture.demarrerVoiture(conducteur);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        voiture.arreterVoiture();
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Voiture voiture = new Voiture("Sedan", "Bleu");

        voiture.changerVitesse(80);
        assertThat(voiture.getVitesse()).isEqualTo(80);
    }

    @Test
    public void testVitesseMax() {
        Voiture voiture = new Voiture("Sedan", "Bleu");

        voiture.changerVitesse(150);

        assertThat(voiture.getVitesse()).isEqualTo(120);
    }
}
