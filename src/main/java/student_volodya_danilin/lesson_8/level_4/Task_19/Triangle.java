package student_volodya_danilin.lesson_8.level_4.Task_19;

import student_volodya_danilin.lesson_8.level_4.Task_15.Shape;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;
    int calculationSideA;
    int calculationSideB;

    public Triangle(int sideA, int sideB, int sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    boolean isTriangleValid() {
        boolean result = false;
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            result = true;
        }
        return result;
    }

    boolean allSidesEqual() {
        boolean result = false;
        if (sideA == sideB && sideB == sideC) {
            result = true;
        }
        return result;
    }

    boolean isStraightTriangle() {
        boolean result = false;
        if (sideA * sideA + sideB * sideB == sideC * sideC) {
            calculationSideA = sideA;
            calculationSideB = sideB;
            result = true;
        }
        if (sideB * sideB + sideC * sideC == sideA * sideA) {
            calculationSideA = sideB;
            calculationSideB = sideC;
            result = true;
        }
        if (sideC * sideC + sideA * sideA == sideB * sideB) {
            calculationSideA = sideC;
            calculationSideB = sideA;
            result = true;
        }
        return result;
    }

    boolean twoSidesEqual() {
        boolean result = false;
        if (sideA == sideB && sideA != sideC) {
            calculationSideA = sideA;
            calculationSideB = sideC;
            result = true;
        }
        if (sideA == sideC && sideA != sideB) {
            calculationSideA = sideA;
            calculationSideB = sideB;
            result = true;
        }
        if (sideB == sideC && sideB != sideA) {
            calculationSideA = sideB;
            calculationSideB = sideA;
            result = true;
        }
        return result;
    }

    void printSides() {
        System.out.println(sideA + " " + sideB + " " + sideC);
    }

    @Override
    public double calculateArea() {
        double result;

        if (isTriangleValid()) {

            if (allSidesEqual()) {
                result = (Math.sqrt(3) / 4) * sideA * sideA;
                return result;
            }

            if (twoSidesEqual()) {
                result = calculationSideB * Math.sqrt(calculationSideA * calculationSideA
                        - (calculationSideB * calculationSideB / 4)) / 2;
                return result;
            }

            if (isStraightTriangle()) {
                result = calculationSideA * calculationSideB / 2;
                return result;
            } else {
                double halfPerimeter = calculatePerimeter() / 2;
                result = Math.sqrt(halfPerimeter * (halfPerimeter - sideA)
                        * (halfPerimeter - sideB)
                        * (halfPerimeter - sideC));
                return result;
            }
        }
        result = 0;
        return result;
    }

    @Override
    public double calculatePerimeter() {
        int result;
        if (isTriangleValid()) {
            result = sideA + sideB + sideC;
            return result;
        }
        result = 0;
        return result;
    }
}
