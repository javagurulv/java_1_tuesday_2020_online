package student_roberts_kupcs.lesson_9.level_2.Task_9;

//Создайте класс PrivateConstructor.
//Создайте класс PrivateConstructorDemo и в его main() методе создайте инстанцию класса PrivateConstructor.
//После этого сделайте так, что бы инстанцию класса PrivateConstructor нельзя было создать
//в демо классе. Подсказка кроется в названии класса!
//PS: не забудьте закоментировать не компилирующийся код в демо классе.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PrivateConstructor {

    private PrivateConstructor() {
    }
}
