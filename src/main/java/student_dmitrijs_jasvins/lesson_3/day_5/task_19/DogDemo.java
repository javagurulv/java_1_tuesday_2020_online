package student_dmitrijs_jasvins.lesson_3.day_5.task_19;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dmitry", 5);
        int dogAge = myDog.getAge();
        String firstName = myDog.getName();
        System.out.println("My age is : " + dogAge);
        System.out.println("My name is : " + firstName);
    }
}
