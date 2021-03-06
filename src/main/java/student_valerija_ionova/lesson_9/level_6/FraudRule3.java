package student_valerija_ionova.lesson_9.level_6;

//Task26 Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule3 extends FraudRule {

    FraudRule3 (String fraudRule3){
        super (fraudRule3);
    }

    @Override
    boolean isFraud(Transaction t){
        return (t.getTrader().getCity().equals("Sydney"));
    }

}
