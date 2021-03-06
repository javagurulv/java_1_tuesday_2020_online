package student_dmitrijs_jasvins.lesson_14.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GreenApplesPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
