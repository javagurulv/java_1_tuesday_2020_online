package student_valerija_ionova.lesson_8.level_4_5.task_15_19;

/*Task 15
Создание иерархии класса Shape (геометрическая фигура).

Объявите в классе Shape абстрактный метод
для подсчёта периметра.

*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape (String title){
        this.title = title;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getTitle(){
        return title;
    }

}
