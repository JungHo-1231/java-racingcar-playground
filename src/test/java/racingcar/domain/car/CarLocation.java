package racingcar.domain.car;

import java.util.Random;

public class CarLocation {

    private int location;

    Random random = new Random();

    public CarLocation() {
        location = 0;
    }

    public int getLocation() {
        return location;
    }

    public int racing() {
        checkMoveLocation();
        return location;
    }

    private void checkMoveLocation() {
        if (random.nextInt(10) > 4) {
            location++;
        }
    }
}
