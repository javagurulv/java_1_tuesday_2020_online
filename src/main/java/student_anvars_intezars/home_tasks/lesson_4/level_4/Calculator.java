package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }

    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;

        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;

        } else {
            return thirdNumber;
        }

    }
}