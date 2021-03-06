package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;

import student_dmitrijs_jasvins.lesson_11.day_6_approved.Book;
import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;

import java.util.Scanner;


public class DeleteByBookUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter information of book, you want to delete: \n " + "Author: ");
        String author = scanner.nextLine();

        System.out.println("Enter title: ");
        String title = scanner.nextLine();

        System.out.println("Enter year: ");
        String year = scanner.nextLine();

        Book findBook = new Book(author, title, year);
        if (bookDatabase.delete(findBook)) {
            System.out.println("Book is deleted!");
        } else {
            System.out.println("We can't delete this book!");
        }
    }
}
