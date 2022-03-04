package student_anvars_intezars.home_tasks.lesson_x;

public class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {

        int minBalance = 0;

        Transaction[] transactions = bankAccount.getTransactions();
        for (int i = 0; i < transactions.length; i++) {
            if (minBalance > transactions[i].getAmount()) {
                minBalance = transactions[i].getAmount();
            }
        }
        return minBalance;
    }
}

