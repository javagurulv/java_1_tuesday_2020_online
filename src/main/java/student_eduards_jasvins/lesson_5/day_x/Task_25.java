package student_eduards_jasvins.lesson_5.day_x;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

public class Task_25 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthFromUser();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayFromUser(array);
        arrayUtil.printArrayInformationToConsole(array);
    }
}
