package student_georgij_galin.Lesson2.Day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter third number");
        double thirdNumber = scanner.nextDouble();

        double addition = firstNumber + secondNumber + thirdNumber;
        double total = addition / 3;

        System.out.println("Average number: " + total);

    }

}