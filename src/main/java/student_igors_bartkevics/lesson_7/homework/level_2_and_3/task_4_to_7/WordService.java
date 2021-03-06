/*
Task_1:

Дана строка с текстом.
Написать метод, который найдёт слово, которое в тексте встречается больше всего раз.

class WordService {

    public String findMostFrequentWord(String text) {
           // write solution here
    }

}

Если несколько слов в тексте встречаются одинаково максимальное число раз,
то возвращаем то слово, которое стоит в тексте первым.

Подумайте на какие подзадачи можно разбить эту задачу?
Распишите на бумаге каждую подзадачу в отдельности:
- как она называется,
- что её надо передать на вход (параметры),
- что будет возвращать в качестве результата.

PS: если вы не можете придумать как разбить эту задачу на подзадачи,
пожалуйста попросите помощи! Умение попросить помощи, когда это нужно
навес золота в ИТ.

Убедитесь, что вы сможете из решений всех подзадач
собрать решение главной задачи.

Task_2:

Запрограммируйте решение каждой из подзадачь из Task_1.txt в отдельности.
Для этого создайте в классе WordService отдельные методы для каждой подзадачи.
Напишите автоматические тесты для каждой подзадачи.
 */
package student_igors_bartkevics.lesson_7.homework.level_2_and_3.task_4_to_7;


import java.util.ArrayList;
import java.util.List;

class WordService {

    public static final String EMPTY_STRING = "";

    public String findMostFrequentWord(String text) {

        return findMostFrequentWordInList(selectWordsFromText(text));

    }

    public String findMostFrequentWordInList(List<String> listOfWords) {

        int repCount;
        int countMax = 0;
        String mostFrequentWord = EMPTY_STRING;

        for (int i = 0; i < listOfWords.size(); i++) {
            repCount = countWordRepsInList(listOfWords.get(i), listOfWords);

            if (isRepCountMax(repCount, countMax)) {
                countMax = repCount;
                mostFrequentWord = listOfWords.get(i);
            }
        }
        return mostFrequentWord;
    }

    public int countWordRepsInList(String wordToCountReps, List<String> listOfWords) {
        int repCount = 0;
        for (String word : listOfWords) {
            if (wordToCountReps.equals(word)) {
                repCount++;
            }
        }
        return repCount;
    }

    public boolean isRepCountMax(int repCount, int countMax) {
        return (repCount > countMax);
    }

    public List<String> selectWordsFromText(String text) {
        List<String> listOfWords = new ArrayList<>();
        String word = EMPTY_STRING;
        for (int i = 0; i < text.length(); i++) {
            if (isLetter(text.charAt(i))) {
                word += text.charAt(i);

                if (isLastIndexOfTheText(i, text)) {
                    listOfWords.add(word);
                }
            }
            else if (!isStringEmpty(word)) {
                listOfWords.add(word);
                word = EMPTY_STRING;
            }
        }
        return listOfWords;
    }

    public boolean isLastIndexOfTheText(int index , String text) {
        return (index == (text.length() -1));
    }

    public boolean isStringEmpty(String word) {
        return word.length() == 0; }

    public boolean isLetter(char symbol) {
        return Character.isLetter(symbol);
    }
}

/*public String findMostFrequentWordInList(List<String> words) {

        //List<String> words = selectWordsFromText(text);
        List<String> differentWords = selectDifferentWords(words);
        int count = 0;
        int countMax = 0;
        String mostFrequentWord = "";
        for (String differentWord : differentWords) {
            for (String word : words) {
                if (differentWord.equals(word)) {
                    count++;
                }
            }
            if (count > countMax) {
                countMax = count;
                mostFrequentWord = differentWord;
            }
            count = 0;
        }
        return mostFrequentWord;
    }


    public List<String> selectDifferentWords(List<String> words) {
        List<String> differentWords = new ArrayList<>();
        for (String word : words) {
            if (!differentWords.contains(word)) {
                differentWords.add(word);
            }
        }
        return differentWords;
    }
    */