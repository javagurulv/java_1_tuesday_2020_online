package student_valerija_ionova.lesson_3.hometasks.day_6.task_27;

/*Найти логическую ошибку в коде.
        Исправить и запустить программу так, что бы она выводила
        на консоль владельца банковского счёта и количество денег.
        Менять можно только класс BankAccount.

        !!Поменяла имена переменных и тип данных в Демо :о*/

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money=money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}