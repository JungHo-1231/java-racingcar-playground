package racingCar;

import java.util.Objects;
import java.util.Random;

public class Position {
    public static final int FORWARD_NUM = 4;
    private int position;


    public Position(){
        this(0);
    }

    public Position(int positionNum) {
        if (positionNum < 0) {
            throw new IllegalArgumentException("0 보다 작은 숫자는 올 수 없습니다");
        }

        this.position = positionNum;
    }

    public void move(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            this.position++;
        }
    }

    public void move() {
        if (isMovable()) {
            this.position++;
        }
    }

    private boolean isMovable() {
        Random random = new Random();

        int randomNo = random.nextInt(11);

        if (randomNo > FORWARD_NUM) {
            return true;
        }

        return false;
    }

    public int getPosition() {
        return position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public boolean isSame(int maxPosition) {
        return position == maxPosition;
    }
}
