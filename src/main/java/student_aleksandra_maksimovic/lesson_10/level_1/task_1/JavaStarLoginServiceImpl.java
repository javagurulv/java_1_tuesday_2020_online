package student_aleksandra_maksimovic.lesson_10.level_1.task_1;

/*
Дан класс:

class JavaStarLoginServiceImpl {

    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }

}

Создать интерфейс для данного класса под названием JavaStarLoginService.
Сделать так, чтобы класс JavaStarLoginServiceImpl имплементировал созданный вами интерфейс.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    private boolean notNull(String text) {
        return text != null;
    }
}
