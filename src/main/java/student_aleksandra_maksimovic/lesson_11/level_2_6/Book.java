package student_aleksandra_maksimovic.lesson_11.level_2_6;

import java.util.Objects;

import teacher.codereview.CodeReview;

/*
Дан класс:
Создайте интерфейс BookDatabase и объявите в нём один метод:

    Long save(Book book);

Этот метод предназначен для сохранения книг в базу данных.
При сохранении каждой книге даётся уникальный номер (id).
Id это целое число. Первая в базе книга получает значение id = 1,
вторая id = 2 и так далее (автоинкремент - для каждой следующей книги
значение id просто увеличивается на единицу). Id присваивается в момент
сохранения книги в базу данных и больше никогда не меняется.


 */

@CodeReview(approved = true)
class Book {
    private Long id;
    private String title;
    private String author;
    private int yearOfIssue;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = 0;
    }

    Book(String author, String title, int yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfIssue() { return this.yearOfIssue; }

    @Override
    public String toString() {
        return this.id + ": " + this.author + ", " + this.title + " (" + this.yearOfIssue + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author) && yearOfIssue == book.yearOfIssue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, yearOfIssue);
    }
}
