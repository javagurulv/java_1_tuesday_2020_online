package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule2 extends FraudRule {
    public FraudRule2(String name) {
        super(name);
    }

    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
