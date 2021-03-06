package student_roberts_kupcs.lesson_10.level_3.Task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {
    void save(Product product);

    Product findByTitle(String productTitle);

}


class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
