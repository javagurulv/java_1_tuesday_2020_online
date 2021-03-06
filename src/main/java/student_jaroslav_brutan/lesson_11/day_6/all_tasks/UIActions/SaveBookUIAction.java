package student_jaroslav_brutan.lesson_11.day_6.all_tasks.UIActions;

import student_jaroslav_brutan.lesson_11.day_6.all_tasks.Book;
import student_jaroslav_brutan.lesson_11.day_6.all_tasks.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class SaveBookUIAction implements UIAction {

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


