package student_roberts_kupcs.lesson_12.homework.level_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ValidationException extends Exception {
    // название валидационного правила, которое создало эту ошибку
    private String ruleName;

    // описание ошибки, которое можно показать на UI
    private String description;

    // название поля при проверке которого произошла эта ошибка
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    private String fieldName;

    // создайте конструктор

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    // создайте только get

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
