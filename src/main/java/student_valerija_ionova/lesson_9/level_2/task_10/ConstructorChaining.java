package student_valerija_ionova.lesson_9.level_2.task_10;

/*Дан класс ConstructorChaining.

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

}

Создайте в этом классе публичный конструктор с двумя параметрами.
Внутри этого конструктора первой строкой вызовите приватный конструктор с одним параметром.

Более подробно про этот подход можно прочитать: constructor chaining in Java.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining (String constructorName, int parameterCount){
        this(constructorName);
        this.parameterCount = parameterCount;
    }

}
