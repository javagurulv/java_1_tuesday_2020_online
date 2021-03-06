package student_roberts_kupcs.lesson_12.homework.level_2_intern.Task_7_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {
    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    // создайте get() методы для каждого из свойств

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
