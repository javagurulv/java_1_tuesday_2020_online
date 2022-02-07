package student_anvars_intezars.home_tasks.lesson_x;

public class BankAccount {

    private String owner;
    private Transaction[] transactions;

    public BankAccount(String owner, Transaction[] transactions) {
        this.owner = owner;
        this.transactions = transactions;
    }

    public String getOwner() {
        return owner;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

}
