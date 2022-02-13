package racingcar.domain;

import racingcar.domain.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars = new ArrayList<>();

    public Cars(String carNames) {
        String[] split = carNames.split(",");

        for (String s : split) {
            this.cars.add(new Car(s));
        }
    }


    public List<String> getCarNames() {
        return cars.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList())
                ;
    }

    public List<Car> play(int gameCount) {
        List<Car> winner = new ArrayList<>();
        System.out.println("살행 결과");
        for (int i = 0; i < gameCount; i++) {

            for (Car car : cars) {
                int racing = car.racing();
                printRacing(car.getName(), racing);

                if (racing == 5) {
                    winner.add(car);
                }
            }
            System.out.println("");
        }
        return winner;
    }

    private void printRacing(String name, int racing) {
        if (racing == 0) {
            System.out.printf("%s : \n", name);
        }
        if (racing == 1) {
            System.out.printf("%s : - \n", name);
        }
        if (racing == 2) {
            System.out.printf("%s : -- \n", name);
        }
        if (racing == 3) {
            System.out.printf("%s : --- \n", name);
        }
        if (racing == 4) {
            System.out.printf("%s : ---- \n", name);
        }
        if (racing >= 5) {
            System.out.printf("%s : ----- \n", name);
        }
    }

}
