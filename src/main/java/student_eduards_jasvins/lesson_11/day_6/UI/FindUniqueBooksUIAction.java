package student_eduards_jasvins.lesson_11.day_6.UI;

import student_eduards_jasvins.lesson_11.day_6.BookDatabase;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FindUniqueBooksUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("Unique books in library: " + bookDatabase.findUniqueBooks());
    }
}
