import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    @Test
    public void Driver_should_be_adult_if_above_minimum_age_required() {
        //GIVEN
        Driver driver = new Driver("John", 10);

        //THEN
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void Driver_should_not_be_adult_below_minimum_age_required() {
        //GIVEN
        Driver driver = new Driver("John", 8);

        //THEN
        assertThat(driver.isAdult()).isFalse();
    }

    @Test
    public void Getter_should_return_age_of_current_driver() {
        //GIVEN
        Driver driver = new Driver("John", 10);

        //THEN
        assertThat(driver.getAge()).isEqualTo(10);
    }
}
