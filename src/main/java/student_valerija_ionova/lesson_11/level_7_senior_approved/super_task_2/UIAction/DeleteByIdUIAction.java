package student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.UIAction;


import student_valerija_ionova.lesson_11.level_7_senior_approved.super_task_2.BookDatabase;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Please enter book's id to delete book: ");
        Scanner in = new Scanner(System.in);
        Long id = in.nextLong();

        if (bookDatabase.delete(id)){
            System.out.println("Book with id " + id + " was deleted");
        }else{
            System.out.println("We don't have book with id " + id + " in database");
        }
        bookDatabase.delete(id);
    }

}
