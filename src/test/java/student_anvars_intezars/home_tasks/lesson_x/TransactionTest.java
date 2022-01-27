package student_anvars_intezars.home_tasks.lesson_x;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void isDepositTest() {

        TransactionType depositTransaction = TransactionType.DEPOSIT;
        TransactionType withdrawalTransaction = TransactionType.WITHDRAWAL;

        Transaction firstTransaction = new Transaction(7,depositTransaction);
        Transaction secondTransaction = new Transaction(8,withdrawalTransaction);

        Boolean firsResult = firstTransaction.isDeposit();
        Boolean secondResult = secondTransaction.isDeposit();

        assertTrue(firsResult);
        assertTrue(!secondResult);
    }

    @Test
    public void isWithdrawalTest() {

        TransactionType depositTransaction = TransactionType.DEPOSIT;
        TransactionType withdrawalTransaction = TransactionType.WITHDRAWAL;

        Transaction firstTransaction = new Transaction(7,depositTransaction);
        Transaction secondTransaction = new Transaction(8,withdrawalTransaction);

        Boolean firsResult = firstTransaction.isWithdrawal();
        Boolean secondResult = secondTransaction.isWithdrawal();

        assertTrue(!firsResult);
        assertTrue(secondResult);
    }

}