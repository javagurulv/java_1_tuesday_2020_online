package student_anvars_intezars.home_tasks.lesson_7.day_1_2_3;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] textAfterSplit = getTextLineToArray(text);
        String resultOfCount = countWordsAfterTextIsSplit(textAfterSplit);

        return resultOfCount;
    }


    public String[] getTextLineToArray(String text) {
        String[] lineOfTextToWords = text.split(" ");
        Arrays.sort(lineOfTextToWords);
        return lineOfTextToWords;
    }

    public String countWordsAfterTextIsSplit(String[] lineOfTextToWords) {
        int howManyTimesWordIsCounted = 0;
        int count = 0;
        String word = lineOfTextToWords[0];
        String current = lineOfTextToWords[0];
        for (int i = 1; i < lineOfTextToWords.length; i++) {
            if (lineOfTextToWords[i].equals(current)) {
                count++;
            } else {
                count = 1;
                current = lineOfTextToWords[i];
            }
            if (howManyTimesWordIsCounted < count) {
                howManyTimesWordIsCounted = count;
                word = lineOfTextToWords[i];
            }
        }
        System.out.println("Most frequent word is " + word + ", found " + howManyTimesWordIsCounted +" times in the text");
        return word;
    }

}

