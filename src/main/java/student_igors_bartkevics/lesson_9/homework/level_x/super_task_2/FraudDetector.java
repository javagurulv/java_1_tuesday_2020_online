/*
Изучаем Single Responsibility Principle.

Пришло время воспользоваться отдельными классами правил обнаружения мошенничества.

Создайте в классе FraudDetector конструктор, который принимает
массив или список объектов типа FraudRule. Через этот конструктор
в класс FraudDetector будут подаваться все автоматические правила
определения мошенничества, которые реализованы отдельными классами.

Исправьте код метода FraudDetector.isFraud(Transaction t).
Логика этого метода будет очень проста: проити по всем FraudRule,
применить его для транзакции и если хоть одно правило обнаружить
мошенничество то вернуть true (да эта транзакция является мошенничеством),
иначе вернуть false (транзакция чистая, ни одно правило не сработало).

Теперь у класса FraudDetector новая ответственность - это последовательное
применение каждого правила для проверяемой транзакции. Код класса FraudDetector
стал небольшим, от не будет меняться с ростом числа правил обнаружения мошеннисества!

Исправьте тесты согласно новой реализации класса FraudDetector!
 */
package student_igors_bartkevics.lesson_9.homework.level_x.super_task_2;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    ArrayList<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        boolean result = false;
        String ruleName = null;
        for (FraudRule rule: fraudRules) {
            if (rule.isFraud(transaction)) {
                result = true;
                ruleName = rule.getRuleName();
                System.out.println(transaction.toString());
                break;
            }
        }
        return new FraudDetectionResult(result, ruleName);
    }

}
