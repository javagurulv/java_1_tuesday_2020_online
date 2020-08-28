package student_igors_bartkevics.lesson_10.homework.level_2.Task_4_5;

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    public String detectDayName(int number) {

        return switch (number) {
            case 1  -> "Monday";
            case 2  -> "Tuesday";
            case 3  -> "Wednesday";
            case 4  -> "Thursday";
            case 5  -> "Friday";
            case 6  -> "Saturday";
            case 7  -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };
    }

}