package student_eduards_jasvins.lesson_8.day_4_5;

public class Circle extends Shape {

    private double radius;
    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;

    }

    @Override
    double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }
}
