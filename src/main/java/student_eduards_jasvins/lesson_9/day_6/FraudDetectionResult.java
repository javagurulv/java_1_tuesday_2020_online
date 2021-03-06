package student_eduards_jasvins.lesson_9.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class  FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;

    }

    public boolean isFraud() { return fraud; }
    public String getRuleName() { return ruleName; }
    public void setFraud(boolean fraud) { this.fraud = fraud; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }
}
