package student_anvars_intezars.home_tasks.lesson_x;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountMaxBalanceFinderTest {

    @Test
    public void calculateMaximumAmountInTransactionsTest() {

        Transaction transaction1 = new Transaction(8,TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction(13,TransactionType.DEPOSIT);
        Transaction transaction3 = new Transaction(42,TransactionType.WITHDRAWAL);
        Transaction allTransactions[] = {transaction1,transaction2, transaction3};

        BankAccount bankAccount = new BankAccount("Vika", allTransactions);
        BankAccountMaxBalanceFinder bankAccountMaxBalanceFinder = new BankAccountMaxBalanceFinder();

        int result = bankAccountMaxBalanceFinder.find(bankAccount);

        assertEquals(42,result);
        assertTrue(result != 8 && result != 13);
    }

}