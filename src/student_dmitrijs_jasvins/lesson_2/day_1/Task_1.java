package student_dmitrijs_jasvins.lesson_2.day_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number");
        int FirstNumber = scanner.nextInt();

        System.out.println("Enter Second number");
        int SecondNumber = scanner.nextInt();

        int addition = FirstNumber + SecondNumber;
        int subtraction = FirstNumber - SecondNumber;
        int multiplication = FirstNumber * SecondNumber;
        double division = FirstNumber / (double) SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + addition);
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + subtraction);
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + multiplication);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + division);

    }

}