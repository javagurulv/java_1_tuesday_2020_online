package student_anvars_intezars.home_tasks.lesson_x;

public class Transaction {

    private int amount;
    private TransactionType transactionType;

    public Transaction(int amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isDeposit() {
        if (transactionType == TransactionType.DEPOSIT) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isWithdrawal() {
        if (transactionType == TransactionType.WITHDRAWAL) {
            return true;
        }
        else {
            return false;
        }
    }
}
