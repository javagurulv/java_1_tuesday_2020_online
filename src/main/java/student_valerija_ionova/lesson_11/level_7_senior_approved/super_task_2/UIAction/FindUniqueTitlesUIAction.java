package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.UIAction;

import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;

public class FindUniqueTitlesUIAction implements UIAction {

    BookDatabase bookDatabase;

    FindUniqueTitlesUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("We have books with following titles in database: \n" + bookDatabase.findUniqueTitles());
    }
}
