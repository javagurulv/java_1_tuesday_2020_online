package student_igors_bartkevics.lesson_10.homework.level_4.task_11_12;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }
}