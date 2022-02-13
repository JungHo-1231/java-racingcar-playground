package racingCar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    @DisplayName("생성 테스트")
    void 생성_테스트() throws Exception {
        //given
        //when
        Position position = new Position(3);

        //then
        assertThat(position).isEqualTo(new Position(3));
    }

    @Test
    @DisplayName("valid")
    void valid() throws Exception {

        assertThatThrownBy(() ->
                new Position(-1)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}