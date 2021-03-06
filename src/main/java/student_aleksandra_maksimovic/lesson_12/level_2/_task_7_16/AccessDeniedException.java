package student_aleksandra_maksimovic.lesson_12.level_2._task_7_16;
/*
Для описания ошибки обозначающей, что у пользователя нет
прав вызывать метод findByUid() нужно создать свой класс ошибки:

class AccessDeniedException extends Exception {

}

И изменить сигнатуру метода findByUid() в интерфейсе следующим образом:

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}

Теперь из сигнатуры метода следует, что данный метод может
вернуть ("кинуть") ошибку типа AccessDeniedException.
 */
 class AccessDeniedException extends Exception {

     AccessDeniedException(String message) {
         super(message);
     }
}
