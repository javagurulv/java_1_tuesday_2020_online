package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean addBook (Book book, BookLibrary library);

    boolean deleteBook (Book book, BookLibrary library);

    String [][] getListOfBooks (BookLibrary library);

    String [][] getListOfReadBooks (BookLibrary library);

    String [][] getListOfNotReadBooks (BookLibrary library);

    ArrayList<Book> findBookByAuthor (String author, BookLibrary library);

    ArrayList<Book> findBookByTitle (String title, BookLibrary library);

    boolean isRead (Book book, BookLibrary library, boolean ifIsRead);

}
