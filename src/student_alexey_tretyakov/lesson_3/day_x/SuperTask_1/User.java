package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;

public class User {
    public String userLoginName;
    public String userPassword;
    public int userTimes = 1;
    public boolean userState = true ;  // не удачное название свойства, не понятно что означает
	// если речь идёт о блокировке пользователя так и назовите свойство blocked или activeUser

    public User ( String userName, String userPwd) {
        this.userLoginName = userName;
        this.userPassword = userPwd;
    }
    public void userCondition() {
        if ( this.userState ) {
            System.out.println("\n User name: " + this.userLoginName +
                    "\n attempt number = " + this.userTimes +
                    "\n user state : NOT blocked");
        } else {
            System.out.println("\n User name: " + this.userLoginName +
                    "\n attempt number = " + this.userTimes +
                    "\n user state : Is Blocked");
        }
    }
}
