package student_anvars_intezars.home_tasks.lesson_9.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareCountry(trader)) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareCountry(Trader trader) {
        String countryName = trader.getCountry();
        if (countryName.equals("Jamaica")) {
            return true;
        } else {
            return false;
        }
    }
}
