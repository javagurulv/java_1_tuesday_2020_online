package student_volodya_danilin.lesson_10.level_2.Task_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

	@CodeReviewComment(teacher = "This field must be private!")
    String detectorName;

    DayOfTheWeekDetectorIfVersion(String detectorName) {
        this.detectorName = detectorName;
    }


    @Override
    public String getDetectorName() {
        return this.detectorName;
    }

    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

}
