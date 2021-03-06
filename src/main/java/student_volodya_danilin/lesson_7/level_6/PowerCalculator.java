package student_volodya_danilin.lesson_7.level_6;

import java.util.Random;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class PowerCalculator {

    public int numberPower(int number, int power) {
        int result = number;
        if (power == 0) {
            return 1;
        }
        else
            {
            for (int i = 1; i < power; i++) {
                result = number * result;
            }
            return result;
        }
    }
}

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Это не автоматический тест!")
@CodeReviewComment(teacher = "Автоматический тест должен проверять результат, а не просто выводить его на консоль!")
class PowerCalculatorTest {
    private PowerCalculator powerCalculator = new PowerCalculator();
    Random randomNumber = new Random();

    public static void main(String[] Args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testNumberPower();
    }

    void testNumberPower() {
        int number = randomNumber.nextInt(9) + 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(number + "^" + i + " = " + powerCalculator.numberPower(number, i));
        }
    }
}