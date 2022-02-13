package racingCar;


public class Car {
    private CarName name;
    private Position position;

    public Car(String carName, int positionNo) {
        name = new CarName(carName);
        position = new Position(positionNo);
    }

    public void move(int randomNo) {
        this.position.move(randomNo);
    }

    public void move(){
        position.move();
    }


    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public boolean isWinner(int maxPosition) {
        return position.isSame(maxPosition);
    }
}
