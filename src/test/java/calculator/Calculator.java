package calculator;


public class Calculator {
    public int calculate(String play) {
        if (play.contains("+")) {
            return plus(play);
        }
        return 0;
    }

    public int plus(String play) {
        play = removeSpaces(play);

        int answer = 0;
        int plusIndex = play.indexOf("+");

        while (plusIndex > 0) {

            char firstNumber = play.charAt(plusIndex - 1);
            char secondNumber = play.charAt(plusIndex + 1);

            Integer firstNumberInteger = Character.getNumericValue(firstNumber);
            Integer secondNumberInteger = Character.getNumericValue(secondNumber);

            if (firstAdd(answer)) {
                answer += secondNumberInteger;
            }

            if (secondAdd(answer)) {
                answer += firstNumberInteger + secondNumberInteger;
            }

            play = play.replaceFirst("\\+", "");
            plusIndex = play.indexOf("+");
        }

        return answer;
    }

    private boolean secondAdd(int answer) {
        return answer == 0;
    }

    private boolean firstAdd(int answer) {
        return answer != 0;
    }

    private String removeSpaces(String play) {
        return play.replace(" ", "");
    }
}
