package student_valerija_ionova.lesson_15.level_2_intern.task_5;

class QuadraticEq {

    public String calc (double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return calculateRootsIfDiscriminantPositive (a, b, discriminant);
        }
        else if (discriminant == 0) {
            return calculateRootsIfDeterminantIsNull(a, b);
        }
        else {
            return calculateRootsIfDiscriminantNegative();
        }
    }

    String calculateRootsIfDiscriminantPositive (double a, double b, double discriminant){
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    String calculateRootsIfDeterminantIsNull(double a, double b){
        double x;
        x = -b / (2 * a);
        return "x = " + x;
    }

    String calculateRootsIfDiscriminantNegative(){
        return "Equation has no roots";
    }

}