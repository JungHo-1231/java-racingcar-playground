package racingcar.domain;

import racingcar.domain.car.Car;

import java.util.List;

public class RacingGame {
    private Cars cars;
    private int gameCount;

    public RacingGame(String carNames) {
        cars = new Cars(carNames);
    }

    public List<String> getCarNames() {
        return cars.getCarNames();
    }

    public void setGameCount(int count) {
        this.gameCount = count;
    }

    public int getGameCount() {
        return this.gameCount;
    }

    public List<Car> play() {
        return cars.play(gameCount);
    }
}
