package student_eduards_jasvins.lesson_2.day_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius!");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area is " + area);
        double perimeter = Math.PI * (2 * radius);
        System.out.println("Perimeter is " + perimeter);



    }

}
