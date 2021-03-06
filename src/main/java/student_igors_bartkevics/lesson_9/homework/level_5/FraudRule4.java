package student_igors_bartkevics.lesson_9.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule4 extends FraudRule{
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    //isTraderFromSidney
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String country = trader.getCountry();
        return country.equals("Jamaica");
    }

}
