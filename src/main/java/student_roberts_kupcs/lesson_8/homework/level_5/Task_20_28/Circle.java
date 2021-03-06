package student_roberts_kupcs.lesson_8.homework.level_5.Task_20_28;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape{
    private double radius;


    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    double calculateArea() {
        double pi = 3.1415;
        return pi * radius * radius;
    }

    double calculatePerimeter() {
        double pi = 3.1415;
        return 2 * pi * radius;

    }
}
