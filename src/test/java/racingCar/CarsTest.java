package racingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CarsTest {


    private Cars cars;
    private String carNames;

    @BeforeEach
    void setUp() {
        carNames = "jung, ho, park";
        cars = new Cars(carNames);
    }

    @Test
    @DisplayName("Cars 생성 테스트")
    void Cars_생성_테스트() throws Exception {
        //when
        List<String> carNamesFromCars = cars.getCarNames();

        //then
        assertThat(carNamesFromCars).contains("jung");
        assertThat(carNamesFromCars).contains("ho");
        assertThat(carNamesFromCars).contains("park");
    }

    @Test
    @DisplayName("우승자 테스트 v2")
    void 우승자_테스트_v2() throws Exception{
        //given
        Car jung = new Car("jung", 4);
        Car ho = new Car("ho", 1);
        Car park = new Car("park", 4);

        //when
        List<Car> original = Arrays.asList(jung, ho, park);
        Cars cars = new Cars(original);
        //then
        assertThat(cars.findWinner()).containsExactly(jung, park);
    }

}