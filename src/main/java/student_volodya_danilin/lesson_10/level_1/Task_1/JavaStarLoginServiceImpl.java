package student_volodya_danilin.lesson_10.level_1.Task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
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
