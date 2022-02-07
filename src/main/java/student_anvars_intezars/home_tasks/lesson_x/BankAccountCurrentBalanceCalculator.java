package student_anvars_intezars.home_tasks.lesson_x;

public class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {

        int currentBalance = 0;
        Transaction [] transactions = bankAccount.getTransactions();
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction.isDeposit()) {
                currentBalance = currentBalance + transaction.getAmount();
            }
            if (transaction.isWithdrawal()) {
                currentBalance = currentBalance - transaction.getAmount();
            }
        }
        return currentBalance;
    }

}
