package student_jaroslav_brutan.lesson_14.day_2;

public class AppleRedColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple){
        return apple.getColor().equals("red");
    }
}