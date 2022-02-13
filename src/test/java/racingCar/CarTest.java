package racingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    String jung = "jung";
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(jung, 4);
    }

    @Test
    @DisplayName("car 생성 테스트")
    void car_생성_테스트() throws Exception{
        //then
        assertThat(car.getName()).isEqualTo(jung);
    }

    @Test
    @DisplayName("car move 이동 테스트")
    void car_move_테스트() throws Exception{
        //when
        car.move(4);
        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("car move 이동 없음 테스트")
    void car_move_이동_없음_테스트() throws Exception{
        //when
        car.move(3);
        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
