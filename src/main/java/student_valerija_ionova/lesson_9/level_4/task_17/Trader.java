package student_valerija_ionova.lesson_9.level_4.task_17;

/*Изучаем Single Responsibility Principle.

Ниже приведён неполный код системы обработки транзакций.
Вам будет необходимо внести в него изменения и доработать его
согласно бизнес требованиям.
Каждая транзакция в системе должна быть проверена на мошенничество (fraud).
Для автоматического обнаружения мошенничества при проверке транзакций
в систему нужно добавить правила, которые будут приведены ниже.

class Trader {

    private String fullName;
    private String city;

}


class Transaction {

    private Trader trader;
    private int amount;

}


class FraudDetector {

    boolean isFraud(Transaction t) {

    }

}

Реализуйте первое правило для автоматического обнаружения мошенничества:
- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.

Внесите в код указанный выше любые изменения, которые вы считаете нужными для того,
чтобы реализовать правило указанное выше.
Напишите тесты, которые доказывают, что ваше решение работает правильно!*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader (String fullName, String city, String country){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName(){
        return fullName;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

}

