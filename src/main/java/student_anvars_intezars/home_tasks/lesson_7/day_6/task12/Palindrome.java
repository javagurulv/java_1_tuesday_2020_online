package student_anvars_intezars.home_tasks.lesson_7.day_6.task12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Palindrome {

    boolean isPalindrome(String text) {
        char[] letters = getTextLettersInArray(text);
        boolean result = checkLettersForPalindromeInArray(letters);
        return result;
    }

    char[] getTextLettersInArray(String text) {
        char[] letterOfTextInArray = text.toCharArray();
        return letterOfTextInArray;
    }

    boolean checkLettersForPalindromeInArray(char[] letterOfTextInArray) {
        int i = 0;
        int j = letterOfTextInArray.length - 1;
            while (j > i) {
                if (letterOfTextInArray[i] != letterOfTextInArray[j]) {
                    return false;
                }
                ++i;
                --j;
            }
        return true;
    }
}
