package student_anvars_intezars.home_tasks.lesson_7.day_6.task11;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.testForCreditCardWithdraw();
    }

    public void testForCreditCardWithdraw() {
        CreditCard creditCard = new CreditCard(77335591, 8978);
        int withdrawResult = creditCard.withdraw(8978, 100);
        if (withdrawResult == 900) {
            System.out.println("Test for withdraw = OK");
        }
        else {
            System.out.println("Test for withdraw = FAIL");
        }
    }
}
