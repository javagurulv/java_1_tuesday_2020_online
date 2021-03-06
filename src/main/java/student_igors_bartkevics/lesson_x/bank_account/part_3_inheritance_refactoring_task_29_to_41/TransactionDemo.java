/*
Task_19:

Вводим новую функциональность: анализ расходов.

При добавлении нового свойства expenseCategory к классу Transaction
у вас должен был получиться следующий код.

class Transaction {

    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    public Transaction(int amount,
                       TransactionType transactionType,
                       ExpenseCategory expenseCategory) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.expenseCategory = expenseCategory;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean isDeposit() {
        return TransactionType.DEPOSIT == this.transactionType;
    }

    public boolean isWithdrawal() {
        return TransactionType.WITHDRAWAL == this.transactionType;
    }

    public ExpenseCategory getExpenseCategory() {
        return this.expenseCategory;
    }

}

В требованиях к новой функциональности написано, что банк планирует анализировать
именно расходы своих клиентов.

Все ли транзакции являются расходами?

Все ли транзакции должны быть включены в анализ расходов?

Вспоминаем, что у транзакций есть свойство transactionType, согласно которому
все транзакции делятся на DEPOSIT и WITHDRAWAL. Очевидно, что транзакции
с типом DEPOSIT не считаются расходами, для них указывать свойство
expenseCategory не имеет смысла. А для транзакций с типом WITHDRAWAL
свойство expenseCategory должно быть обязательным.

Имея код класса Transaction приведённый выше можем ли мы создать:
- WITHDRAWAL транзакцию с указанием значения свойства expenseCategory?
- DEPOSIT транзакцию без указания значения свойства expenseCategory?
- DEPOSIT транзакцию с указанием значения свойства expenseCategory?

Создайте класс TransactionDemo и продемонстрируйте создание транзакций
с разными комбинациями значений свойств transactionType и expenseCategory.
 */
package student_igors_bartkevics.lesson_x.bank_account.part_3_inheritance_refactoring_task_29_to_41;

public class TransactionDemo {

    public static void main(String[] args) {

        //Transaction withdrawalWithExpenseCategory = new Transaction(2000, TransactionType.WITHDRAWAL, ExpenseCategory.ENTERTAINMENT);
        //Transaction depositWithoutExpenseCategory = new Transaction(1000, TransactionType.DEPOSIT, null);
        //Transaction depositWithExpenseCategory = new Transaction(2000, TransactionType.DEPOSIT, ExpenseCategory.ENTERTAINMENT);

        //System.out.println("Withdrawal with expense category : " + withdrawalWithExpenseCategory.getExpenseCategory());
        //System.out.println("Deposit without expense category : " + depositWithoutExpenseCategory.getExpenseCategory());
        //System.out.println("Deposit with expense category : " + depositWithExpenseCategory.getExpenseCategory());
    }

}
