package student_dmitrijs_jasvins.lesson_3.day_1;

class RobotTest {
    public static void main(String[] args) {
        System.out.println("First robot parameters :");
        Robot firstRobot = new Robot();
        firstRobot.SayHello();
        firstRobot.sayYourName();

        System.out.println("Second robot parameter :");
        Robot secondRobot = new Robot();
        secondRobot.SayHello();
        secondRobot.sayYourName();
    }
}
