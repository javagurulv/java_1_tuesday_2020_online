package student_igors_bartkevics.lesson_8.homework.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorDemo {
    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.setOverview("It's a demo of default constructor");
        System.out.println(defaultConstructor.getOverview());
    }
}
