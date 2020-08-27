package student_roberts_kupcs.lesson_9.level_4.Task_17;

class FraudDetector {
    boolean isFraud(Transaction t) {

        return isPokemon(t) || isMore1000000(t) || fromSidney(t);
    }

    private boolean isPokemon(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    //Task 18- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.

    private boolean isMore1000000(Transaction t) {
        return t.getAmount() > 1000000;
    }

    //Task 19 - Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.

    private boolean fromSidney(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

    //Task_20 - Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.

    private boolean traderFromJamaica(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
