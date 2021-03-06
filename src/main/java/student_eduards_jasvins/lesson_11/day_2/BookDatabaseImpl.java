package student_eduards_jasvins.lesson_11.day_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    Long currentId = 0L;
    BookValidator bookValidator = new BookValidator();

    private Optional <Book> getBookById(Long bookId) {
        Optional <Book> result = Optional.empty();
        for (Book book : books) {
            if (book.getId().equals(bookId));
            break;
        }
        return result;
    }

    private Optional <Book> getBookFromList(Book bookToGet) {
        Optional <Book> result = Optional.empty();
        for (Book book : books) {
            if (book.equals(bookToGet));
              result = Optional.of(book);
              break;
        }
        return result;
    }


    @Override
    public Long save(Book book) {
        books.add(book);
        Long bookId = currentId;
        book.setId(bookId);
        currentId++;
        return currentId;
    }

    @Override
    public boolean delete(Long bookId) {
        Optional <Book> bookOptional = getBookById(bookId);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        }
        else return false;
    }

    @Override
    public boolean delete(Book book) {
        Optional <Book> bookOptional = getBookFromList(book);
        if (bookOptional.isPresent()) {
            books.remove(bookOptional.get());
            return true;
        }
        else return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.empty();
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                result = Optional.of(book);
                break;
            }
        }
        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (bookValidator.isBookAuthor(book, author)) {
                bookByAuthor.add(book);
            }
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> byTitle = new ArrayList<>();
        for (Book book : books) {
            if (bookValidator.isBookTitle(book, title)) {
                byTitle.add(book);
            }
        }
        return  byTitle;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List <Book> books = findByAuthor(author);
        for (Book book : books) {
            delete(book);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List <Book> booksTitle = findByTitle(title);
        for (Book book : booksTitle) {
            delete(book);
        }
    }
}
