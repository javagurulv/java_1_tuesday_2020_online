package student_roberts_kupcs.lesson_6.homework.level_5_6;

//Дано поле игры крестики нолики размерностью три на три клетки.
//Поле представлено двумерным массивом целых чисел, где:
//-1 - это пустая клетка,
//0 - это клетка в которую сделал ход первый игрок,
//1 - это клетка в которую сделал ход второй игрок.
//
//Создайте класс TicTacToe и в этом классе реализуйте
//метод для определения является ли данная позиция
//победной по горизонталям для указанного игрока.
//
//Метод должен иметь следующую сигнатуру:
//public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck).
//
//Поле передаётся в этот метод как первый параметр int[][] field.
//Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.
//
//Метод должет вернуть:
// - true если в одной из горизонталей есть три подряд клетки
//   занятые знаком указанного игрока (int playerToCheck),
// - false иначе.
//
//Создать класс TicTacToeTest
//и написать тесты для разработанного метода.

import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    //task_19
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    //task_20
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < field.length; j++) {
            if ((field[0][j] == playerToCheck) && (field[1][j] == playerToCheck) && (field[2][j] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    //task_21
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
            return true;
        } else if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    //task_22
    public boolean isWinPosition(int[][] field, int playerToCheck) {
        //TicTacToe ticTacToe = new TicTacToe();  // зачем создавать тут инстанцию?
        if (/*ticTacToe.*/isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (/*ticTacToe.*/isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (/*ticTacToe.*/isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        //TicTacToe ticTacToe = new TicTacToe();  // зачем создавать тут инстанцию?

        // Эту вложенность if + for читать почти не возможно!
        if ((!/*ticTacToe.*/isWinPositionForVerticals(field, 1)) && (/*ticTacToe.*/!isWinPositionForVerticals(field, 0))) {
            if ((!/*ticTacToe.*/isWinPositionForHorizontals(field, 1)) && (/*ticTacToe.*/!isWinPositionForHorizontals(field, 0))) {
                if ((!/*ticTacToe.*/isWinPositionForDiagonals(field, 1)) && (/*ticTacToe.*/!isWinPositionForDiagonals(field, 0))) {
                    /*for (int i = 0; i < field.length; i++) {
                        for (int j = 0; j < field.length; j++) {
                            if (field[i][j] != -1) {
                                return true;
                            }
                        }
                    }*/
                    return true;
                }
            }
        }
        return false;
    }

    //task_24
    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    //task25
    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Kоординатu клетки куда хочет походить игрок: ");
        int x = sc.nextInt();
        System.out.println("2 Kоординатu клетки куда хочет походить игрок: ");
        int y = sc.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    //task 26
    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == field[i].length - 1) {
                    System.out.println(field[i][j]);
                } else {
                    System.out.println(field[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    //task 27
    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
