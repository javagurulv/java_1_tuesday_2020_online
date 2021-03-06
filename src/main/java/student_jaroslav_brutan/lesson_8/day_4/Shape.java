package student_jaroslav_brutan.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getTitle(){
        return title;
    }
}
