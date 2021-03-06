package student_dmitrijs_jasvins.lesson_9.day_2.task_10;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    @CodeReviewComment(teacher = "this(constructorName); ??")
    public ConstructorChaining(int parameterCount) {
        this("Dmitry");
        this.parameterCount = parameterCount;
    }
}
