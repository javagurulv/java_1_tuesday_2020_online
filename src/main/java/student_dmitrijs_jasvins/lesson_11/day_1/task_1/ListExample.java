package student_dmitrijs_jasvins.lesson_11.day_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for (Integer number : numbers)
            System.out.println(number);

        System.out.println("");

        LinkedList<Integer> numb = new LinkedList<>();
        numb.add(4);
        numb.add(3);
        numb.add(6);

        numb.remove(0);

        for (Integer number : numb)
            System.out.println(number);
    }
}
