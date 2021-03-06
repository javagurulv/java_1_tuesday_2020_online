package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import student_jaroslav_brutan.lesson_11.day2_6.Book;
import student_jaroslav_brutan.lesson_11.day2_6.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    public void execute(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the author of your book: ");
        String author = scanner.nextLine();
        System.out.println("Please enter the title of your book: ");
        String title = scanner.nextLine();
        System.out.println("Please enter the year book has been written: ");
        String yearOfIssue = scanner.nextLine();
        Book yourBook = new Book(author,title,yearOfIssue);
        bookDatabase.save(yourBook);
    }
}
