package student_aleksandra_maksimovic.lesson_3.homeworks.day_4.task_17;


   /*
   Найти ошибку в коде.
   Исправить и запустить программу.
    */


    class BankAccount {

        private String ownerFirstName;
        private String ownerLastName;
        private int moneyAmount;

        public BankAccount(String ownerFirstName ,
                           String ownerLastName ,
                       int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        public String getOwnerFirstName() {
            return this.ownerFirstName;
        }

        public String getOwnerLastName() {
            return this.ownerLastName;
        }

        public int getMoneyAmount() {
            return this.moneyAmount;
        }

    }

    class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
            String ownerFirstName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }

    }

