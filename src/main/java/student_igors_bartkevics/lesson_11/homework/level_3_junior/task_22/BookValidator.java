package student_igors_bartkevics.lesson_11.homework.level_3_junior.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookValidator {

    boolean isBookByAuthor(Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookWithTitle(Book book, String title) {
        return (book.getTitle().equals(title));
    }
}
