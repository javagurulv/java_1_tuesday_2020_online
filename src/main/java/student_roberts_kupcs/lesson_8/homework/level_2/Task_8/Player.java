package student_roberts_kupcs.lesson_8.homework.level_2.Task_8;

//

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {
    HumanPlayer(String name) {
        super(name);                // + super(name);

    }
}
