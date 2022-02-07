package student_anvars_intezars.home_tasks.lesson_x;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BankAccountCurrentBalanceCalculatorTest {

    @Test
    public void calculateBalanceAfterDepositTransactionTest() {

        Transaction transaction1 = new Transaction(8,TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction(13,TransactionType.DEPOSIT);
        Transaction allTransactions[] = {transaction1,transaction2};

        BankAccount bankAccount = new BankAccount("Vika", allTransactions);
        BankAccountCurrentBalanceCalculator balanceCalculator = new BankAccountCurrentBalanceCalculator();
        int result = balanceCalculator.calculate(bankAccount);

        assertEquals(21,result);
    }

    @Test
    public void calculateBalanceAfterWithdrawalTransactionTest() {

        Transaction transaction1 = new Transaction(8,TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction(3,TransactionType.WITHDRAWAL);
        Transaction allTransactions[] = {transaction1,transaction2};

        BankAccount bankAccount = new BankAccount("Vika", allTransactions);
        BankAccountCurrentBalanceCalculator balanceCalculator = new BankAccountCurrentBalanceCalculator();
        int result = balanceCalculator.calculate(bankAccount);

        assertEquals(5,result);

    }

    @Test
    public void negativeBalanceCalculationTest() {

        Transaction transaction1 = new Transaction(8,TransactionType.DEPOSIT);
        Transaction transaction2 = new Transaction(3,TransactionType.WITHDRAWAL);
        Transaction transaction3 = new Transaction(6,TransactionType.WITHDRAWAL);
        Transaction allTransactions[] = {transaction1,transaction2,transaction3};

        BankAccount bankAccount = new BankAccount("Vika", allTransactions);
        BankAccountCurrentBalanceCalculator balanceCalculator = new BankAccountCurrentBalanceCalculator();
        int result = balanceCalculator.calculate(bankAccount);

        assertEquals((-1),result);
    }

}