/*
Создайте класс Move с двумя свойствами:

    private int x;
    private int y;

и конструктором, который принимает два целых числа
- координаты клетки в которую хочет походить игрок
и get методами для этих свойств.

В классе TicTacToe создайте метод:

public Move getNextMove() {
    // запросите у пользователя с консоли две координаты
    // клетки куда хочет походить игрок
    // создайте экземпляр класса Move и передайте ему
    // в конструктор введённые пользователем координаты
    // верните созданный объект Move из метода.
}
 */
package student_igors_bartkevics.lesson_6.homework.level_6.task_25;

public class Move {

    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
