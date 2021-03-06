package student_valerija_ionova.lesson_10.level_x.super_task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitToCelsius implements TemperatureConverter{

    @Override
    public double convert(double fahrenheitTemperature) {
        return Math.round((fahrenheitTemperature - 32) * 5 / 9);
    }
}
