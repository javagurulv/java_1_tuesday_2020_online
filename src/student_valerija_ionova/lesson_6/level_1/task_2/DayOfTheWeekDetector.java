package student_valerija_ionova.lesson_6.level_1.task_2;

/*Дана программа:

class Task_3 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        if ((firstNumber >=1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
        else {
            System.out.println("Please input a valid number between 1 and 7");
        }
    }

}

Создайте класс DayOfTheWeekDetector.
В классе DayOfTheWeekDetector создайте метод:
String detectDayName(int number).
Этот метод будет по введённому числу определять день недели.
Реализуйте этот метод (можно взять код приведённый выше).
Создайте класс DayOfTheWeekDetectorTest и напишите
автоматические тесты для всех сценариев.*/

public class DayOfTheWeekDetector {

    String detectDayName(int number){
        switch (number){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Not valid number!";
        }
    }

}
