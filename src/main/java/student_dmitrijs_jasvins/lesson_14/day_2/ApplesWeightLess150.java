package student_dmitrijs_jasvins.lesson_14.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ApplesWeightLess150 implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
