package student_anvars_intezars.home_tasks.lesson_11.level_3_tasks;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CodeReview(approved = true)
class BookDataBaseImpl implements BookDataBase {

    @CodeReviewComment(teacher = "Must be private!")
    //added
    private List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        id++;
        book.setId(id);
        books.add(book);

        return id;
    }


    @Override
    public boolean delete(Long bookID) {
        return books.removeIf(book -> book.getId().equals(bookID));
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            Book listOfBooks = books.get(i);
            if (listOfBooks.getId().equals(bookId)) {
                return Optional.of(listOfBooks);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksOfOneAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            String authorOfBooks = books.get(i).getAuthor();
            if (authorOfBooks.contains(author)) {
                Book authorBooks = books.get(i);
                booksOfOneAuthor.add(authorBooks);
            }
        }
        return booksOfOneAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksWithSameTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            String titleOfBooks = books.get(i).getTitle();
            if (titleOfBooks.contains(title)) {
                Book oneTitleBooks = books.get(i);
                booksWithSameTitle.add(oneTitleBooks);
            }
        }
        return booksWithSameTitle;
    }

    @Override
    public int countAllBooks() {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) != null) {
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public void deleteByAuthor(String author) {
        String authorOfBooks = "";
        for (int i = 0; i < books.size(); i++) {
            authorOfBooks = books.get(i).getAuthor();
            if (authorOfBooks.contains(author)) {
                Book bookToDelete = books.get(i);
                books.remove(bookToDelete);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        String titleOfBooks = "";
        for (int i = 0; i < books.size(); i++) {
            titleOfBooks = books.get(i).getTitle();
            if (titleOfBooks.contains(title)) {
                Book bookToDelete = books.get(i);
                books.remove(bookToDelete);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksOfSearchCriteria = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book bookFromLibrary = books.get(i);
            if (searchCriteria.match(bookFromLibrary)) {
                booksOfSearchCriteria.add(bookFromLibrary);
            }
        }
        return booksOfSearchCriteria;

    }
}

