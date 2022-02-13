package racingcar.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    public static final String POBI = "pobi";
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(POBI);
    }

    @Test
    @DisplayName("Car 생성 테스트")
    void Car_생성_테스트() throws Exception {
        //then
        assertThat(car.getName()).isEqualTo(POBI);
        assertThat(car.getLocation()).isEqualTo(0);
    }
    
    @Test
    @DisplayName("경주 시작 테스트")
    void 경주_시작_테스트() throws Exception{
        //given 
        int movedCount = car.racing();
        //when
        System.out.println("movedCount = " + movedCount);
        //then 
    }
}

