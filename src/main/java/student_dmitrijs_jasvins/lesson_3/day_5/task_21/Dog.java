package student_dmitrijs_jasvins.lesson_3.day_5.task_21;

class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Dog parametrs : ");
        System.out.println("Dog name : " + name);
        System.out.println("Dog age : " + age);
        System.out.println("Dog color : " + color);
    }
}
