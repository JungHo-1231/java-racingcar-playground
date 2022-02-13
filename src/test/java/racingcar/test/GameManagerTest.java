package racingcar.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.GameManager;
import racingcar.domain.car.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class GameManagerTest {

    public static final String CAR_NAMES = "pobi,crong,honux";
    GameManager gameManager;
    private int count;

    @BeforeEach
    void setUp() {
        count = 10;

        gameManager = new GameManager(CAR_NAMES);
        gameManager.setGameCount(count);
    }

    @Test
    @DisplayName("GamaManager 자동차 생성 테스트 ")
    void GamaManager_생성_테스트() throws Exception {
        //given
        //when
        //then
        List<String> carNamesFromGame = gameManager.getCarNames();

        assertThat(carNamesFromGame).contains("pobi");
        assertThat(carNamesFromGame).contains("crong");
        assertThat(carNamesFromGame).contains("honux");
    }


    @Test
    @DisplayName("GameManager 시도할 횟수 테스트")
    void GameManager_시도할_횟수_테스트() throws Exception {
        //given 
        //when
        int gameCount = gameManager.getGameCount();
        //then
        assertThat(gameCount).isEqualTo(count);
    }

    @Test
    @DisplayName("GameManager 게임 시작 테스트")
    void GameManager_게임_시작_테스트() throws Exception {
        //given
        //when
        List<Car> winner = gameManager.play();
        //then

        StringBuilder sb = new StringBuilder();
        for (Car car : winner) {
            sb.append(car.getName());
            sb.append(",");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        sb.append("가 최종 우승했습니다.");

        System.out.println("sb = " + sb);
    }


}
