import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    private Voiture voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Voiture("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        voiture.accelerer();
        assertThat(voiture.getVitesse()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        voiture.accelerer();
        voiture.ralentir();
        assertThat(voiture.getVitesse()).isEqualTo(0);
    }

    @Test
    public void testDemarrerVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        Conducteur conducteurTest = new Conducteur("John", 20);

        voiture.demarrerVoiture(conducteurTest);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        Conducteur conducteurTest = new Conducteur("John", 20);

        voiture.arreterVoiture(conducteurTest);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        Conducteur conducteurTest = new Conducteur("John", 20);

        voiture.changerVitesse(conducteurTest, 80);
        assertThat(voiture.getVitesse()).isEqualTo(80);
    }

    @Test
    public void testVitesseMax() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        Conducteur conducteurTest = new Conducteur("John", 20);

        voiture.changerVitesse(conducteurTest,120);

        assertThat(voiture.getVitesse()).isEqualTo(120);
    }

    @Test
    public void testVitesseSuperieurMax() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        Conducteur conducteurTest = new Conducteur("John", 20);

        voiture.changerVitesse(conducteurTest,150);

        assertThat(voiture.getVitesse()).isEqualTo(120);
    }

    @Test
    public void testVitesseInferieurMin() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        Conducteur conducteurTest = new Conducteur("John", 20);

        voiture.changerVitesse(conducteurTest,-50);

        assertThat(voiture.getVitesse()).isEqualTo(0);
    }
}
