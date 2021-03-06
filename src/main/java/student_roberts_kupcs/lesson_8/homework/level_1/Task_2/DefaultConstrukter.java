package student_roberts_kupcs.lesson_8.homework.level_1.Task_2;

//Нужно ли в классе создавать дефолтный конструктор
//или Java его автоматически добавит при компиляции
//кода? Ответьте на вопрос примером кода!

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstrukter {

    //Конструктор имеется в любом классе. Даже если вы его не написали, компилятор Java сам создаст конструктор
    // по умолчанию (default constructor), который будет пустым и не делает ничего, кроме вызова конструктора
    // суперкласса.
}
