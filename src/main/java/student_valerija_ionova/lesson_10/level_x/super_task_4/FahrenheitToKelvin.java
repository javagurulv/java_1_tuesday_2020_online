package student_valerija_ionova.lesson_10.level_x.super_task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitToKelvin implements TemperatureConverter{

    @Override
    public double convert(double temperature) {
        return Math.round((temperature - 32)* 5 / 9 +273.15);
    }
}
