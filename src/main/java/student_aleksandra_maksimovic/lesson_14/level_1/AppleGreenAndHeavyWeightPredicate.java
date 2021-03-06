package student_aleksandra_maksimovic.lesson_14.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
