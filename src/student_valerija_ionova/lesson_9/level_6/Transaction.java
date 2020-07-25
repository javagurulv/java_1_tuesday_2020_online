package student_valerija_ionova.lesson_9.level_6;

public class Transaction {

    private Trader trader;
    private int amount;

    Transaction (Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader(){
        return trader;
    }

    int getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return (trader.toString()+"\nTransaction amount: "+amount+" EUR");
    }
}
