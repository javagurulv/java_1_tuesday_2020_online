package student_eduards_jasvins.lesson_9.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Jamaica");
    }
}
