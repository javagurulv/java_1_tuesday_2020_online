package student_anvars_intezars.home_tasks.lesson_14;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> getAllGreenApples(List<Apple> apples) {
        List<Apple> greenApples = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i).getColor().equals("green")) {
                Apple greens = apples.get(i);
                greenApples.add(greens);
            }
        }
        return greenApples;
    }

    public List<Apple> getAllRedApples(List<Apple> apples) {
        List<Apple> redApples = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i).getColor().equals("red")) {
                Apple red = apples.get(i);
                redApples.add(red);
            }
        }
        return redApples;
    }

    //public List<Apple> findByColor(String colorToFind) {
    //    String color = "";
     //   for(; )
    }
