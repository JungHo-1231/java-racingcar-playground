package racingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    List<Car> carList = new ArrayList<>();

    public Cars(List<Car> list) {
        carList = list;
    }

    public Cars(String carNames) {
        settingCarList(carNames);
    }

    private void settingCarList(String carNames) {
        carNames = removeSpace(carNames);

        String[] split = carNames.split(",");

        addCarList(split);
    }

    private void addCarList(String[] split) {
        for (String carName : split) {
            carList.add(new Car(carName, 4));
        }
    }

    private String removeSpace(String carNames) {
        return carNames.replace(" ", "");
    }

    public List<String> getCarNames() {
        return carList.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }


    public List<Car> findWinner() {
        int maxPosition = getMaxPosition();

        return findWinners(maxPosition);
    }

    private List<Car> findWinners(int maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : carList) {
            if (car.isWinner(maxPosition)) {
                winners.add(car);
            }
        }

        return winners;
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : carList) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }

        return maxPosition;
    }
}
