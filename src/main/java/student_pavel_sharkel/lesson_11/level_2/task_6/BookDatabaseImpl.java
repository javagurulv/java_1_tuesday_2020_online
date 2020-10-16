package student_pavel_sharkel.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase{

    Long id = 0L;
    List<Book> bookList = new ArrayList<>();

  //      Book book1 = new Book("Author1", "Title1");


    @Override
    public Long save(Book book) {
        id++;
        bookList.add(book);
        book.setId(id);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        boolean result = false;
        if (bookId <= id) {
            bookList.remove(bookId);
            result = true;
        }
        return result;
    }

    @Override
    public boolean delete(Book book) {
        boolean result = false;
        for (Book value : bookList) {
            if (value.equals(book)) {
                bookList.remove(book);
                result = true;
            }
        }
        return result;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.empty();
        for (Book value : bookList) {
            if (bookId == value.getId()) {
                result = Optional.of(value);
            } else result = Optional.empty();
        }
        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> requestedAuthorBooks = new ArrayList<>();
        for (Book value : bookList) {
            if (value.getAuthor().equals(author)) {
                requestedAuthorBooks.add(value);
            }
        }
        return requestedAuthorBooks;
    }
}
