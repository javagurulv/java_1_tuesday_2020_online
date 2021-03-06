package student_igors_bartkevics.lesson_12.homework.level_6_middle_task_35_to_48;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringFieldValueValidator {

    boolean stringContainsLettersSpaceAndNumbers(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!isCharacterEnglishLetter(string.charAt(i)) && !Character.isDigit(string.charAt(i)) &&
                    !Character.isSpaceChar(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isCharacterEnglishLetter(Character character) {
        return ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'));
    }

}
