package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.BookDatabaseImpl;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_34.UIAction;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FindByTitleUIActionDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Bates B., Sierra K.", "Head First Java");
        Book book2 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship");
        Book book3 = new Book("Hunt A., Thomas D.", "The Pragmatic Programmer. From Journeyman to Master");
        Book book4 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 2");
        Book book5 = new Book("Martin R.", "Clean Code - A Handbook of Agile Software Craftsmanship rev 3");
        Book book6 = new Book("Bates K., Sierra R.", "Head First Java");

        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);

        UIAction findByTitleUIAction = new FindByTitleUIAction(bookDatabase);
        findByTitleUIAction.execute();

    }

}
