package student_roberts_kupcs.lesson_8.homework.level_5.Task_20;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
