package student_pavel_sharkel.lesson_8.level_2.task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Student extends Course {

    String studentName;

    public Student (String studentName, int courseNumber) {
        this.studentName = studentName;
    }
}
