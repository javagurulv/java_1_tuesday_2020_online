/*
Task_2:
Создайте класс ракета и сделайте так,
что бы это класс был доступен только внутри того пакета, в котором он находится.
Каким оператором доступа для этого надо воспользоваться?
========================================================
Необходимо воспользоваться дэфолтным оператором доступа.
 */
package student_igors_bartkevics.lesson_9.homework.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rocket {
    private String model;
}
