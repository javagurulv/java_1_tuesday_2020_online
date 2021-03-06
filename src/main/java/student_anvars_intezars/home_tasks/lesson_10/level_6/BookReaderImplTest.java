package student_anvars_intezars.home_tasks.lesson_10.level_6;

import teacher.codereview.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class BookReaderImplTest {

    public static void main(String[] args) {

        BookReaderImplTest bookReaderImplTest = new BookReaderImplTest();
        bookReaderImplTest.toAddNewBookTest1();
        bookReaderImplTest.toAddNewBookTest2NegativeResult();
        bookReaderImplTest.toAddNewBookTest3();
        bookReaderImplTest.newBookWithoutTitleTest();
        bookReaderImplTest.newBookWithoutAuthorTest();
        bookReaderImplTest.deletingBookTest();
        bookReaderImplTest.printListOfBooksInLibraryTest();
        bookReaderImplTest.findBookByAuthorTest();
        bookReaderImplTest.findBookByAuthorFirstLetters();
        bookReaderImplTest.findBookByTitleTest();
        bookReaderImplTest.readBookWhichAreOnlyInLibraryTest();
        bookReaderImplTest.markUnreadBooksWhichAreOnlyInTheLibraryTest();
        bookReaderImplTest.findBookByFirstLettersOfTitleTest();
        bookReaderImplTest.listOfOnlyReadBooks();
        bookReaderImplTest.listOfOnlyNotReadBooks();
    }

    void toAddNewBookTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Harry Potter","Rowling");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Test for adding new book to library = OK");
        } else {
            System.out.println("Test for adding new book library = FAIL");
        }
    }

    void toAddNewBookTest2NegativeResult() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Lord of the Rings","Tolkien");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Test2 for adding new book to library = OK");
        } else {
            System.out.println("Test2 for adding new book library = FAIL");
        }
    }

    void toAddNewBookTest3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Lord of the Rings","Anvar");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Tes3 for adding new book to library = OK");
        } else {
            System.out.println("Test3 for adding new book library = FAIL");
        }
    }

    void newBookWithoutTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("","Anvar");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Tes4 for adding new book to library = OK");
        } else {
            System.out.println("Test4 for adding new book library = FAIL(missing title)");
        }
    }

    void newBookWithoutAuthorTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Lord of the Rings","");
        boolean result = bookReader.isAddedBook(secondBook);
        if (result) {
            System.out.println("Test5 for adding new book to library = OK");
        } else {
            System.out.println("Test5 for adding new book library = FAIL(missing author)");
        }
    }

    void deletingBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Harry Potter","Rowling");
        bookReader.save(secondBook);
        boolean result = bookReader.delete(firstBook);
        if (result) {
            System.out.println("Test6 for deleting book in library = OK");
            System.out.println();
        } else {
            System.out.println("Test6 for deleting book in library = FAIL");
        }
    }

    void printListOfBooksInLibraryTest() {
            BookReaderImpl bookReader = new BookReaderImpl();
            Book firstBook = new Book("Lord of the Rings","Tolkien");
            bookReader.save(firstBook);
            Book secondBook = new Book("Black Swan","Nassim Nicholas Taleb");
            bookReader.save(secondBook);
            Book thirdBook = new Book("Elon Musk","Ashley Vans");
            bookReader.save(thirdBook);
            System.out.println("List of Books:");
            bookReader.printListOfBooks();
            System.out.println();
        }

    void findBookByAuthorTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        Book booksOfOneAuthor = bookReader.findByAuthor("Nassim Nicholas Taleb");
        if (booksOfOneAuthor.equals(secondBook)) {
            System.out.println("Test7 for finding books of one author = OK");
        } else {
            System.out.println("Test7 for finding books of one author = FAIL");
        }
    }

    void findBookByAuthorFirstLetters() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        Book booksOfOneAuthor = bookReader.findByAuthor("Nassim");
        if (booksOfOneAuthor.equals(secondBook)) {
            System.out.println("Test8 for finding books by using first letters of author = OK");
        } else {
            System.out.println("Test8 for finding books by using first letters of author = FAIL");
        }
    }

    void findBookByTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        Book booksOfOneAuthor = bookReader.findByTitle("Antifragile");
        if (booksOfOneAuthor.equals(secondBook)) {
            System.out.println("Test9 for finding books by title = OK");
        } else {
            System.out.println("Test9 for finding books by title = FAIL");
        }
    }

    void readBookWhichAreOnlyInLibraryTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        boolean result = bookReader.isRead(secondBook);
        if (result) {
            System.out.println("Test10 to read book only from library  = OK");
        } else {
            System.out.println("Test10 to read book only from library = FAIL");
        }
    }

    void markUnreadBooksWhichAreOnlyInTheLibraryTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        boolean result = bookReader.notRead(secondBook);
        if (result) {
            System.out.println("Test11 mark book as unread book only from library  = OK");
        } else {
            System.out.println("Test11 mark book as unread only from library = FAIL");
        }
    }

    void findBookByFirstLettersOfTitleTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        Book booksOfOneAuthor = bookReader.findByTitle("Anti");
        if (booksOfOneAuthor.equals(secondBook)) {
            System.out.println("Test12 for finding books by using first letters of title = OK");
            System.out.println();
        } else {
            System.out.println("Test12 for finding books by using first letters of title = FAIL");
        }
    }

    void listOfOnlyReadBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        bookReader.isRead(secondBook);
        System.out.println("Books which are read from the library:");
        bookReader.isReadFromLibrary();
        System.out.println();
        }

    void listOfOnlyNotReadBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Lord of the Rings","Tolkien");
        bookReader.save(firstBook);
        Book secondBook = new Book("Antifragile","Nassim Nicholas Taleb");
        bookReader.save(secondBook);
        Book thirdBook = new Book("Harry Potter","Rowling");
        bookReader.save(thirdBook);
        bookReader.notRead(firstBook);
        bookReader.notRead(thirdBook);
        System.out.println("Books which are not read from the library:");
        bookReader.isNotReadFromLibrary();
    }
}





