package student_volodya_danilin.lesson_12.level_1.Task_3;

/*
Нельзя "экстендить" несколько классов.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyException extends Throwable {
    private Exception exception;
    private RuntimeException runtimeException;
}
