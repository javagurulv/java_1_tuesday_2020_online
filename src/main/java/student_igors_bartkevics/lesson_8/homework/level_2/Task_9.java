/*
Внесите изменения в код программы так,
чтобы можно было создать экземпляр класса
ComputerPlayer. Класс ComputerPlayer должен
наследоваться от класса Player. Изменения
в код можно вносить только в класс ComputerPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer {

}
 */
package student_igors_bartkevics.lesson_8.homework.level_2;

import teacher.codereview.CodeReview;

class Task_9 {

    class Player {

        private String name;

        Player(String name) {
            this.name = name;
        }

    }

	@CodeReview(approved = true)
    class ComputerPlayer extends Player{
        ComputerPlayer(String name) {
            super(name);
        }
    }

}
