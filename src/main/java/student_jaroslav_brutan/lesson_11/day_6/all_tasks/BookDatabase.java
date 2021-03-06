package student_jaroslav_brutan.lesson_11.day_6.all_tasks;

import student_jaroslav_brutan.lesson_11.day_3.all_tasks.SearchCriteria;
import student_jaroslav_brutan.lesson_11.day_5.all_tasks.Book;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@CodeReview(approved = true)
public interface BookDatabase {

    Long save(student_jaroslav_brutan.lesson_11.day_6.all_tasks.Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<student_jaroslav_brutan.lesson_11.day_6.all_tasks.Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    List<Book> find(SearchCriteria searchCriteria);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();
}
