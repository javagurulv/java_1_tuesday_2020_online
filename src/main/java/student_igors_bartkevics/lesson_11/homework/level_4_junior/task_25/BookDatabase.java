package student_igors_bartkevics.lesson_11.homework.level_4_junior.task_25;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();
}
