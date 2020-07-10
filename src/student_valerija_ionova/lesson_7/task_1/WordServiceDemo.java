package student_valerija_ionova.lesson_7.task_1;

import java.util.Scanner;

public class WordServiceDemo {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input text!");

        WordService wordService = new WordService();
        String text = scanner.nextLine();

        String [] wordsArray = wordService.createArrayOfWords(text);
        String [] wordsArrayToLowerCase = wordService.arrayToLowerCase(wordsArray);
        int [] countOfWords = wordService.countOfWords(wordsArrayToLowerCase);
        System.out.println("Most frequent word: "+ wordService.findMostFrequentWord(wordsArrayToLowerCase, countOfWords));

    }
}
