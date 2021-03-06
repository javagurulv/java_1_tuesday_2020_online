package student_jaroslav_brutan.lesson_11.day_4.all_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UniqueWordFinder {

    Set<String> find(String text){
        String[] words = text.split("");
        return new HashSet<>(Arrays.asList(words));
    }
}
