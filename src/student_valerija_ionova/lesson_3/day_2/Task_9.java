package student_valerija_ionova.lesson_3.day_2;

/*Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".*/

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){
        //Запрашиваем имя
       System.out.println("Please input you name:");

       Scanner myInput = new Scanner( System.in );
       String UserName = myInput.next();

       //Выводим приветствие
        System.out.println("Hello "+UserName);

    }
}
