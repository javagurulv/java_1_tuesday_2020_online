package student_dmitrijs_jasvins.lesson_3.day_6.task_26;

class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Computer");
        myProduct.setRegularPrice(350);
        myProduct.setDiscount(15);
        myProduct.printInformation();
    }
}
