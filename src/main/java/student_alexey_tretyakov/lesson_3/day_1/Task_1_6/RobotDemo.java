package student_alexey_tretyakov.lesson_3.day_1.Task_1_6;
 /* Task_3
 Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.
  */

import java.util.Scanner;

public class RobotDemo {

     public static void main(String[] args) {

         Robot robotNew = new Robot();
         /*
         Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли слово "Hello!".
          */
         robotNew.sayHello();

         /* Task_5
         В методе main(...) класса RobotDemo вызовите
метод sayYourName() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли "My name is ROBO".
          */
         robotNew.sayYourName();
         /* Task_6
         Создаём свою армию роботов!

        В методе main(...) класса RobotDemo продемонстрируйте создание
        нескольких виртуальный обьектов робот и работу с ними
        (вызовы у них методов sayHello() и sayYourName()).
          */
         Scanner scanner = new Scanner(System.in);
         System.out.println("\n \n We make a whole army of robots!!!");
         System.out.print(" How many robots you want? Please, input number = ");
         int scanNumber = scanner.nextInt();

         Robot[] robotArmy = new Robot[scanNumber+1];

         for (int i=1; i<=scanNumber; i++) {
            robotArmy[i] = new Robot();
            System.out.print("Robot number " + i + " say hello!  -  ");
            robotArmy[i].sayHello();
            robotArmy[i].sayYourName();
            System.out.println( " " + i );

        }


     }

}
