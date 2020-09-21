package student_igors_bartkevics.lesson_14.homework.level_1_intern;

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

    public List<Apple> findGreenApples(List<Apple> inventory) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals("green")) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> findRedApples(List<Apple> inventory) {
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals("red")) {
                redApples.add(apple);
            }
        }
        return redApples;
    }

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                apples.add(apple);
            }
        }
        return apples;
    }

}