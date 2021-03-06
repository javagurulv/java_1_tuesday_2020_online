package student_jaroslav_brutan.lesson_11.day_4.all_tasks;

import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BookDatabase {

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);
}
