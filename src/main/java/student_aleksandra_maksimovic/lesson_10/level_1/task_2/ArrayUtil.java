package student_aleksandra_maksimovic.lesson_10.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {

   int[] createArray(int arrayLength);

   void fillArrayWithRandomNumbers(int[] array);

   void printArrayToConsole(int[] array);

   int findMaxNumber(int[] array);

   int findMinNumber(int[] array);

}
