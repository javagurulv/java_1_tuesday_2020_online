package student_valerija_ionova.lesson_3.hometasks.day_4.task_14;


/*Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Book.*/

class Book {

    private String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

