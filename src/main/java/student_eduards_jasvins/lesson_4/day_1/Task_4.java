package student_eduards_jasvins.lesson_4.day_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
