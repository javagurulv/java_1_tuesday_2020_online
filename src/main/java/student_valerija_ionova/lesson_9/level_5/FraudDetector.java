package student_valerija_ionova.lesson_9.level_5;

//Task 29
//Создайте в классе FraudDetector конструктор, который принимает
//массив или список объектов типа FraudRule. Через этот конструктор
//в класс FraudDetector будут подаваться все автоматические правила
//определения мошенничества, которые реализованы отдельными классами.
//
//Исправьте код метода FraudDetector.isFraud(Transaction t).
//Логика этого метода будет очень проста: проити по всем FraudRule,
//применить его для транзакции и если хоть одно правило обнаружить
//мошенничество то вернуть true (да эта транзакция является мошенничеством),
//иначе вернуть false (транзакция чистая, ни одно правило не сработало).
//
//Теперь у класса FraudDetector новая ответственность - это последовательное
//применение каждого правила для проверяемой транзакции. Код класса FraudDetector
//стал небольшим, от не будет меняться с ростом числа правил обнаружения мошеннисества!
//
//Исправьте тесты согласно новой реализации класса FraudDetector!

import java.util.ArrayList;
import java.util.Arrays;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class FraudDetector{


    private ArrayList <FraudRule> fraudRules;

    FraudDetector (FraudRule ... fraudRules){
        this.fraudRules = new ArrayList<>(Arrays.asList(fraudRules));
    }

    boolean isFraud (Transaction t){
        boolean result = false;

        for (FraudRule fraudRule : fraudRules){
            if (fraudRule.isFraud(t)) result = true;
        }
        return result;
    }

}
