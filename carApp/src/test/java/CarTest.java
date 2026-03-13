import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void Car_should_gain_10_speed_when_speeding_up() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");

        //WHEN
        car.speedUp();

        //THEN
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void Car_should_lose_10_speed_when_slowing_down() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");

        //WHEN
        car.speedUp();
        car.slowDown();

        //THEN
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void Car_should_start_with_adult_driver() {
        //SETUP
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.startCar(driverTest);

        //THEN
        assertThat(outputStreamCaptor.toString()).contains("démarre");

        //TEARDOWN
        System.setOut(standardOut);
    }

    @Test
    public void Car_should_not_start_with_non_adult_driver() {
        //SETUP
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 8);

        //WHEN
        car.startCar(driverTest);

        //THEN
        assertThat(outputStreamCaptor.toString()).contains("pas assez âgé");

        //TEARDOWN
        System.setOut(standardOut);
    }

    @Test
    public void Car_should_stop() {
        //SETUP
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.stopCar(driverTest);

        //THEN
        assertThat(outputStreamCaptor.toString()).contains("arrête");

        //TEARDOWN
        System.setOut(standardOut);
    }

    @Test
    public void Car_should_accelerate_to_given_speed() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.changeSpeed(driverTest, 80);

        //THEN
        assertThat(car.getSpeed()).isEqualTo(80);
    }

    @Test
    public void Car_should_slow_down_to_given_speed() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.changeSpeed(driverTest, 50);
        car.changeSpeed(driverTest, 20);

        //THEN
        assertThat(car.getSpeed()).isEqualTo(20);
    }

    @Test
    public void Car_should_reach_max_speed() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.changeSpeed(driverTest,120);

        //THEN
        assertThat(car.getSpeed()).isEqualTo(120);
    }

    @Test
    public void Car_should_reach_min_speed() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.changeSpeed(driverTest,10);
        car.changeSpeed(driverTest,0);

        //THEN
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void Car_should_reach_top_speed_when_asked_to_go_beyond() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.changeSpeed(driverTest,150);

        //THEN
        assertThat(car.getSpeed()).isEqualTo(120);
    }

    @Test
    public void Car_should_go_minimum_speed_when_asked_to_go_below() {
        //GIVEN
        Car car = new Car("Sedan", "Bleu");
        Driver driverTest = new Driver("John", 20);

        //WHEN
        car.changeSpeed(driverTest,-50);

        //THEN
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
