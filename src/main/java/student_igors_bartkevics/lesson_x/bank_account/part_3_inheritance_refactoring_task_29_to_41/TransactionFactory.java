/*
Task_21:

Вводим новую функциональность: анализ расходов.

Как разрешить создавать WITHDRAWAL транзакции
с указанием обязательного свойства expenseCategory, а для DEPOSIT транзакций
при создании не указывать значение свойства expenseCategory.

Есть несколько способов решения этой задачи.

Давайте рассмотрим способ с применением дизайн паттерна фактори метод (FactoryMethod).

Создайте класс TransactionFactory:

class TransactionFactory {

    public static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount);
        // создайте в классе Transaction соответствующий конструктор в котором
        // свойство transactionType устанавливается в значение TransactionType.DEPOSIT,
        // а свойство expenseCategory в значение null
    }

    public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount, expenseCategory);
        // создайте в классе Transaction соответствующий конструктор в котором
        // свойство transactionType устанавливается в значение TransactionType.WITHDRAWAL,
        // а свойство expenseCategory принимает значение полученное в параметре метода
    }

}

Класс TransactionFactory будет отвечать за создание объектов Transaction.
Это единственная его ответственность. Дизайн паттерн фактору метод - это метод
единственное предназначение которого энкапсулировать в себе алгоритм создания
сложных объектов (объектов с не тривиальной логикой создания, таких как класс Transaction).

Удалите из класса Transaction конструктор со всеми параметрами, который
был создан нами ранее. В классе Transaction должно остаться только два
конструктора, которые были созданы в рамках этого задания. Исправьте код
в тех местах приложения, которые использовали удалённый конструктор.

Новые объекты класса Transaction можно создавать следующим образом:

Transaction deposit = TransactionFactory.createDepositTransaction(10);
Transaction withdrawal = TransactionFactory.createDepositTransaction(10, ExpenseCategory.FOOD);
 */
package student_igors_bartkevics.lesson_x.bank_account.part_3_inheritance_refactoring_task_29_to_41;

class TransactionFactory {

    public static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount);
    }

    public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount, expenseCategory);
    }

}
