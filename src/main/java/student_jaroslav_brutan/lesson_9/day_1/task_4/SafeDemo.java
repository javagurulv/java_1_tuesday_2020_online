package student_jaroslav_brutan.lesson_9.day_1.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();

        safe.pinCode = 1234; 
        safe.moneyInSafe = 153.40;

        System.out.println(safe.toString());
        //System.out.println("Pin code - " + safe.pinCode + ", money in safe - " + safe.moneyInSafe);
    }
}
