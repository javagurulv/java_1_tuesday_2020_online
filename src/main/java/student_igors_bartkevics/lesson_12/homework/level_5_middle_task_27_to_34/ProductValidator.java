package student_igors_bartkevics.lesson_12.homework.level_5_middle_task_27_to_34;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}