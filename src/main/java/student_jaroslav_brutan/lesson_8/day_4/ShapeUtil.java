package student_jaroslav_brutan.lesson_8.day_4;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtil {

    public Circle createRandomCircle(){
        Random random = new Random();
        double radius = random.nextInt(5);
        return new Circle("Circle",radius);
    }

    public Square createRandomSquare(){
        Random random = new Random();
        double radius = random.nextInt(5);
        return new Square("Square", radius);
    }

    public Rectangle createRandomRectangle(){
        Random random = new Random();
        double sideA = random.nextInt(5);
        double sideB = random.nextInt(5);
        return new Rectangle("Rectangle", sideA, sideB);
    }

    public Triangle createRandomTriangle(){
        Random random = new Random();
        double sideA = random.nextInt(5);
        double sideB = random.nextInt(5);
        double sideC = random.nextInt(5);
        return new Triangle("Triangle", sideA, sideB, sideC);
    }

     public Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public double calculateArea(Shape[] shapes){
        double areaSum = 0;
        for (Shape shape : shapes){
            areaSum = areaSum + shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeter(Shape[] shapes){
        double perimeterSum = 0;
        for (Shape shape : shapes){
            perimeterSum = perimeterSum + shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
