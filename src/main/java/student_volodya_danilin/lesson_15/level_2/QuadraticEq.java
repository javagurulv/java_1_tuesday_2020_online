package student_volodya_danilin.lesson_15.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantIsGreaterThanZero(a, b, discriminant);
        }
        else if (discriminant == 0) {
            return discriminantIsEqualToZero(a, b);
        }
        else {
            return discriminantIsLessThanZero();
        }
    }

    private String discriminantIsGreaterThanZero(double a,
                                         double b,
                                         double discriminant) {
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String discriminantIsEqualToZero(double a, double b) {
        double x;
        x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantIsLessThanZero() {
        return "Equation has no roots";
    }

}