package student_jaroslav_brutan.lesson_8.day_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FishingBoat extends Boat {

    private int speed;

    public FishingBoat(String model, String color, int speed){
        super(model, color);
        this.speed = speed;
    }

    @Override
    String boatSpeed() {
        return ("What's your boat " + boatSpeed() + " ?");
    }
}

