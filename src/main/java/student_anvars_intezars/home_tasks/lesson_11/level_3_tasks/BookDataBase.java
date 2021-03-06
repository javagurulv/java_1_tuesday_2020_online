package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
interface BookDataBase {

    Long save(Book book);

    boolean delete(Long bookId);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

}
