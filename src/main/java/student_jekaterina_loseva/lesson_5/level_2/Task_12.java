/*--------------------------------------------------------
Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива случайным числом,
        - вывести значение каждой ячейки на консоль.
--------------------------------------------------------*/

package student_jekaterina_loseva.lesson_5.level_2;

import java.util.Random;

public class Task_12 {

    public static void main(String[] args) {
        int[] randomNumbers = new int[3];

        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(50);
            System.out.println(randomNumbers[i]);
        }
    }
}
