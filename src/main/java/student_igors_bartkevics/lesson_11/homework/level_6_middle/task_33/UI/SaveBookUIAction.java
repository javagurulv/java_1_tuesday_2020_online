package student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.UI;

import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.Book;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.BookDatabase;
import student_igors_bartkevics.lesson_11.homework.level_6_middle.task_33.UIAction;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        // запросите все данные о книге с консоли у пользолвателя
        System.out.println("Enter author of the book");
        String author = scanner.nextLine();
        System.out.println("Enter title of the book");
        String title = scanner.nextLine();
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        Book book = new Book(author, title);
        // сохраните его в базу данных: bookDatabase.save(book);
        bookDatabase.save(book);
    }

}