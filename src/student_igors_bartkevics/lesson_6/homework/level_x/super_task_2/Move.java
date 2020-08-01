/*
Создать простой искуственный интеллект (компьютерного игрока)
для игры в крестики нолики из day_5 и day_6.
Искусственный интеллект можно реализовать
так, что он будет выбирать рандомную пустую клетку
и ходить в неё. А можно научить компьютер распознавать
выигрышные комбинации в один ход и выигрывать, а
так же защищаться от проигрыша в один ход если это
возможно.
 */
package student_igors_bartkevics.lesson_6.homework.level_x.super_task_2;

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