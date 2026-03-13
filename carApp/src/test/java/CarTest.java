import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testSpeedUp() {
        car.speedUp();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        car.speedUp();
        car.slowDown();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testStartCar() {
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        car.startCar(driverTest);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        car.stopCar(driverTest);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        car.changeSpeed(driverTest, 80);
        assertThat(car.getSpeed()).isEqualTo(80);
    }

    @Test
    public void testMaxSpeed() {
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        car.changeSpeed(driverTest,120);

        assertThat(car.getSpeed()).isEqualTo(120);
    }

    @Test
    public void testBeyondMaxSpeed() {
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        car.changeSpeed(driverTest,150);

        assertThat(car.getSpeed()).isEqualTo(120);
    }

    @Test
    public void testBelowMinSpeed() {
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        car.changeSpeed(driverTest,-50);

        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
