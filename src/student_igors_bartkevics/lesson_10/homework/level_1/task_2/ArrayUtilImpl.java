/*
Создать для этого класса интерфейс ArrayUtil.
Сделать так, чтобы класс ArrayUtilImpl имплементировал созданный вами интерфейс.
Не забудьте про аннотицию @Override. Её очень желательно "вешать" на методы,
которые вляются реализацией методов объявленных в интерфейсе.
 */
package student_igors_bartkevics.lesson_10.homework.level_1.task_2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilImpl implements ArrayUtil{

    @Override
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if(max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    @Override
    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if(min.isPresent()) {
            minValue = min.getAsInt();
        }
        return minValue;
    }

}
