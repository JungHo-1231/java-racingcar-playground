package racingcar.domain.car;

public class Car {
    private CarName name;
    private CarLocation location;

    public Car(String name) {
        this.name = new CarName(name);
        this.location = new CarLocation();
    }

    public String getName() {
        return name.getCarName();
    }

    public int getLocation() {
        return location.getLocation();
    }

    public int racing() {
        return location.racing();
    }
}
