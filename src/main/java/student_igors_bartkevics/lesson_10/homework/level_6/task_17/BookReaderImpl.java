package student_igors_bartkevics.lesson_10.homework.level_6.task_17;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();
    private BookValidator validator = new BookValidator();

    boolean isLibraryEmpty() {
        return library.isEmpty();
    }

    public boolean isBookInReaderLibrary(Book bookToCheck) {
        boolean result = false;

        for (Book book : library) {
            if (book.getAuthor().equals(bookToCheck.getAuthor()) &&
                    book.getTitle().equals(bookToCheck.getTitle())) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean addBook(Book book) {
        if (validator.isBookValidToAddInReaderLibrary(book,this)) {
            library.add(book);
            return true;
        }
        else return false;
    }

    @Override
    public boolean removeBook(Book book) {
        if (validator.isBookValidToRemoveItFromReaderLibrary(book, this)) {
            library.remove(book);
            return true;
        }
        else return false;
    }

    @Override
    public String[] bookLibraryToStringList() {
        int bookListLength = library.size();
        String[] bookList = new String[bookListLength];
        if (!isLibraryEmpty()) {
            for (int i = 0; i < bookListLength; i++) {
                bookList[i] = library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]";
            }
        }
        return bookList;
    }
}
