package student_igors_bartkevics.lesson_10.homework.level_6.task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {
    private String author;
    private String title;
    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
