package student_aleksandra_maksimovic.lesson_10.level_4.task_11_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
