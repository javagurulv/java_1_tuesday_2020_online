package student_anvars_intezars.home_tasks.lesson_10.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean isAddedBook(Book book);

    void save(Book book);

    void saveReadBook(Book book);

    void saveUnreadBook(Book book);

    boolean booksEqualByAuthorAndTitle(Book book);

    boolean booksHaveTitleAndAuthor(Book book);

    Book findByTitle(String title);

    Book findByAuthor(String author);

    boolean delete(Book book);

    void printListOfBooks();

    boolean isRead(Book bookToRead);

    boolean notRead (Book bookNotRead);

    void isReadFromLibrary();

    void isNotReadFromLibrary();


}
