package student_dmitrijs_jasvins.lesson_11.day_4.task_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinder {

    Set<String> find(String text) {
        String[] words = splitTextOnWords(text);
        return new HashSet<>(Arrays.asList(words));
    }

    String[] splitTextOnWords(String text) { return text.split(" "); }

}
