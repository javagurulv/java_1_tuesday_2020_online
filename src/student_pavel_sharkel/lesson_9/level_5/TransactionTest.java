package student_pavel_sharkel.lesson_9.level_5;

class TransactionTest {

    public static void main(String[] args) {

        TransactionTest transactionTest = new TransactionTest();
        transactionTest.notPokemonTest();
        transactionTest.isPokemonTest();
        transactionTest.valueTrueTest();
        transactionTest.valueFalseTest();
        transactionTest.cityTrueTest();
        transactionTest.cityFalseTest();

    }

    void notPokemonTest() {
        Trader trader = new Trader("Albert", "Ludza", "Latvija");
        FraudRule rule1 = new FraudRule1("rule1");
        Transaction t = new Transaction(trader, 200);

        if (rule1.isFraud(t)) {
            System.out.println("Not Pokemon test is OK");
        } else {
            System.out.println("Not Pokemon test is FAILED");
        }
    }

    void isPokemonTest() {
        Trader trader = new Trader("Pokemon", "Talsi", "Latvija");
        FraudRule rule1 = new FraudRule1("rule1");
        Transaction t = new Transaction(trader, 200);

        if (rule1.isFraud(t)) {
            System.out.println("Is Pokemon test is FAILED");
        } else {
            System.out.println("Is Pokemon test is OK");
        }
    }

    void valueTrueTest() {
        Trader trader = new Trader("TestName", "Jekabpils", "Latvija");
        FraudRule rule2 = new FraudRule2("rule2");
        Transaction t = new Transaction(trader, 10);

        if (rule2.isFraud(t)) {
            System.out.println("Value true test is OK");
        } else {
            System.out.println("Value true test is FAILED");
        }
    }

    void valueFalseTest() {
        Trader trader = new Trader("TestName", "Jekabpils", "Latvija");
        FraudRule rule2 = new FraudRule2("rule2");
        Transaction t = new Transaction(trader, 1000000);

        if (rule2.isFraud(t)) {
            System.out.println("Value false test is OK");
        } else {
            System.out.println("Value false test is FAILED");
        }
    }

    void cityTrueTest() {
        Trader trader = new Trader("Janis", "Orge", "Latvija");
        FraudRule rule3 = new FraudRule3("rule3");
        Transaction t = new Transaction(trader, 100);

        if (rule3.isFraud(t)) {
            System.out.println("City true test is OK");
        } else {
            System.out.println("City true test is FAILED");
        }
    }

    void cityFalseTest() {
        Trader trader = new Trader("Robert", "Sydney", "Australia");
        FraudRule rule3 = new FraudRule3("rule3");
        Transaction t = new Transaction(trader, 100);

        if (rule3.isFraud(t)) {
            System.out.println("City false test is FAILED");
        } else {
            System.out.println("City false test is OK");
        }
    }

    public void countryTrueTest() {
        Trader trader = new Trader("John", "Vilnius", "Lithuania");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCountryOk(trader)) {
            System.out.println("County true test is OK");
        } else {
            System.out.println("Country true test is FAILED");
        }
    }

    public void countryFalseTest() {
        Trader trader = new Trader("Albert", "Kingston", "Jamaica");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCountryOk(trader)) {
            System.out.println("County false test is FAILED");
        } else {
            System.out.println("Country false test is OK");
        }
    }

    public void germanCheckingTest() {
        Trader trader = new Trader("Tim", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isGermanTransaction(trader,transaction)) {
            System.out.println("German transactions over 1000 test is FAILED");
        } else {
            System.out.println("German transactions over 1000 test is OK");
        }
    }
}
