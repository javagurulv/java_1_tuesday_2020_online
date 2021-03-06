package student_roberts_kupcs.lesson_12.homework.level_2_intern.Task_7_16;

import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}
