package student_dmitrijs_jasvins.lesson_9.day_2.task_10;

public class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this("Dmitry");
        this.parameterCount = parameterCount;
    }
}
