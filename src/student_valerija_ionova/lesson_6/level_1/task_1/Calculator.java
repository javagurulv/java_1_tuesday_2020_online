package student_valerija_ionova.lesson_6.level_1.task_1;

/*Упростите метод boolean isEven(int number).
Код внутри этого метода может быть записан в одну строку.
Перед изменением кода убедитесь, что у вас есть автоматические тесты для проверки этого кода.
Если автоматических тестов нет то напишите их, убедитесь, что они проходят и только тогда меняйте код.

class Calculator {

    public boolean isEven(int number) {
         if(number % 2 == 0) {
             return true;
         } else {
             return false;
         }
    }

}*/

public class Calculator {
    public boolean isEven(int number) {
        return (number % 2 ==0);
    }
}
