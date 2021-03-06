package student_alexey_tretyakov.lesson_6.level_1;
/*Создайте класс DayOfTheWeekDetector.
        В классе DayOfTheWeekDetector создайте метод:
        String detectDayName(int number).
        Этот метод будет по введённому числу определять день недели.
        Реализуйте этот метод (можно взять код приведённый выше).
        Создайте класс DayOfTheWeekDetectorTest и напишите
        автоматические тесты для всех сценариев.

 */
import java.util.Scanner;

public class DayOfTheWeekDetector {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int inputDay = myInput.nextInt();
       DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
       System.out.println(dayOfTheWeekDetector.detectDayName(inputDay));



}
    public String detectDayName (int inNumber){

        return switch (inNumber) {
            case 1 -> (" Monday");
            case 2 -> (" Tuesday");
            case 3 -> (" Wednesday");
            case 4 -> (" Thursday");
            case 5 -> (" Friday");
            case 6 -> (" Saturday");
            case 7 -> (" Sunday");
            default -> (" Please input a valid number between 1 and 7. ");
        };
    }


}
