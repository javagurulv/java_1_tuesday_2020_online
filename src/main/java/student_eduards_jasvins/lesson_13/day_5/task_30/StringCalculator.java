package student_eduards_jasvins.lesson_13.day_5.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StringCalculator {

    int add(String numbers) {
        String[] arrayNumber = numbers.split(",|\n");
        int sum  = 0;
        if (numbers.equals("")) {
            return 0;
        } 
        else {
            for (String number : arrayNumber) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
