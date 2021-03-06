package student_eduards_jasvins.lesson_9.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract  class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() { return ruleName; }

    abstract boolean isFraud(Transaction t);
}
