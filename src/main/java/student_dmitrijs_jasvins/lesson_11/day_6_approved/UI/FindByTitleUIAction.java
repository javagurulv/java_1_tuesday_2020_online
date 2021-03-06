package student_dmitrijs_jasvins.lesson_11.day_6_approved.UI;


import student_dmitrijs_jasvins.lesson_11.day_6_approved.Book;
import student_dmitrijs_jasvins.lesson_11.day_6_approved.BookDatabase;

import java.util.List;
import java.util.Scanner;


public class FindByTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title: ");
        String title = scanner.nextLine();

        List<Book> list = bookDatabase.findByTitle(title);
        if (list.size() > 0) {
            System.out.println("Books with this '"+ title +"' is: " + list);
        } else {
            System.out.println("Book with this '" + title + "' library don't have");
        }
    }
}
