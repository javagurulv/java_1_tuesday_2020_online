/*
Решаем задачу: сколько денег на данный момент у пользователя на банковском счете
(текущий баланс)?

class BankAccount {

    private String owner;
    private Transaction[] transactions;

    public BankAccount(String owner, Transaction[] transactions) {
        this.owner = owner;
        this.transactions = transactions;
    }

    public String getOwner() {
        return this.owner;
    }

    public Transaction[] getTransactions() {
        return this.transactions;
    }

}

Как вы видите банковский аккаунт хранит только транзакции совершённые с ним
за всё время существования. Банковский акаунт не хранит
в явном виде количество денег, которое на данный момент доступны (текущий баланс).
Единственный способ как узнать текущий баланс
на банковском счете пользователя - это взять за основу, что при создании
банковского аккаунта на нём находится 0 денег и последовательно "накатить"
(выполнить, применить) все транзакции добавляя или отнимая деньги от этой суммы в
зависимости от типа транзакции:
- DEPOSIT - добавляет деньги на счёт,
- WITHDRAWAL - вычитает деньги со счёта.

Для выполнения этого расчёта создайте класс BankAccountCurrentBalanceCalculator.

class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный выше.
    }

}

Очень часто в программировании классы создаются не только для описания данных
(такие как Transaction и BankAccount), но и для реализации алгоритмов
обработки данных. Класс BankAccountCurrentBalanceCalculator типичный пример класса,
который создан для хранения одного из алгоритмов обработки банковского аккаунта.
Создание отдельного класса для алгоритма обработки данных позволяет изолировать
этот алгоритм от всего остального кода приложения, а так же намного чётче
сформулировать за что будет отвечать этот алгоритм (что будет делать).
Хороший алгоритм - это тот алгоритм, который выполняет только одну задачу,
но делает это хорошо! Это Single Responsibility Principle - принцып одной ответственности.

Изоляция отдельного алгоритма
от остальной части программного кода позволяет легко протестировать данный
алгоритм, а так же в будущем легко вносить в этот алгоритм изменения если это
потребуется. Реализация алгоритма в отдельном классе так же позволит в будушем
легко использовать этот алгоритм в разных частях программы если это потребуется.
Для этих целей применяется принцып Dependency Injection, но о нём мы будем
говорить в другой раз.
 */
package student_igors_bartkevics.lesson_x.bank_account.part_1_basic_task_1_to_16;

class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {
        // реализуйте данный метод, за основу возьмите способ расчёта
        // текущего баланса описанный выше.
        int currentBalance = 0;
        Transaction[] transactions = bankAccount.getTransactions();
        for (Transaction transaction : transactions) {
            if (transaction.isDeposit()) {
                currentBalance += transaction.getAmount();
            }
            if (transaction.isWithdrawal()) {
                currentBalance -= transaction.getAmount();
            }
        }
        return currentBalance;
    }

}