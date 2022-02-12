package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class CalculatorPlusTest {

    private Calculator calculator = new Calculator();

    static Stream<Arguments> numberPlusNumber() {
        return Stream.of(
                Arguments.of("1+1", 2),
                Arguments.of("1+2", 3),
                Arguments.of("2+1", 3),
                Arguments.of("2+2", 4)
        );
    }

    static Stream<Arguments> numberPlusNumberPlusNumber() {
        return Stream.of(
                Arguments.of("1+1+1", 3),
                Arguments.of("1+2+1", 4),
                Arguments.of("2+1+1", 4),
                Arguments.of("2+2+1", 5)
        );
    }

    @DisplayName("nomber + nomber 테스트")
    @ParameterizedTest(name = "{index} : {0} = {1}")
    @MethodSource("numberPlusNumber")
    void 덧셈_테스트3(String input, int expected) throws Exception {
        //given
        //when
        int answer = calculator.calculate(input);
        //then
        assertThat(answer).isEqualTo(expected);
    }


    @DisplayName("number + number + number 테스트")
    @ParameterizedTest(name = "{index} : {0} = {1}")
    @MethodSource("numberPlusNumberPlusNumber")
    void 덧셈_덧셈_덧셈_테스트(String input, int expected) throws Exception {
        //given
        //when
        int answer = calculator.calculate(input);
        //then
        assertThat(answer).isEqualTo(expected);
    }

    @Nested
    @DisplayName("한자리수 더하기 한자리수 숫자 테스트")
    class NumberToNumberTest {

        @Test
        @DisplayName("1 + 1 테스트 (덧셈) ")
        void 덧셈_테스트() throws Exception {
            //given
            String input = "1 + 1";
            //when
            int answer = calculator.calculate(input);
            //then
            assertThat(answer).isEqualTo(2);
        }

        @Test
        @DisplayName("2 + 1 테스트 (덧셈) ")
        void 덧셈_테스트2() throws Exception {
            //given
            String input = "2 + 1";
            //when
            int answer = calculator.calculate(input);
            //then
            assertThat(answer).isEqualTo(3);
        }
    }


    @Nested
    @DisplayName("한자리수 더하기 한자리수 더하기 숫자 테스트")
    class NumberToNumberToNumberTest {
        @Test
        @DisplayName("1+1+1 테스트")
        void 한자리수_더하기_한자리수_더하기_한자리수_테스트() throws Exception {
            //given
            String input = "1 + 1 +1";
            //when
            int answer = calculator.calculate(input);
            //then
            assertThat(answer).isEqualTo(3);
        }

        @Test
        @DisplayName("1+1+2 테스트")
        void 한자리수_더하기_한자리수_더하기_한자리수_테스트2() throws Exception {
            //given
            String input = "1 + 1 +2";
            //when
            int answer = calculator.calculate(input);
            //then
            assertThat(answer).isEqualTo(4);
        }

        @Test
        @DisplayName("1+1+1+1 테스트")
        void 한자리수_더하기_한자리수_더하기_한자리수_테스트3() throws Exception {
            //given
            String input = "1+1 +1+1";
            //when
            int answer = calculator.calculate(input);
            //then
            assertThat(answer).isEqualTo(4);
        }
    }
}
