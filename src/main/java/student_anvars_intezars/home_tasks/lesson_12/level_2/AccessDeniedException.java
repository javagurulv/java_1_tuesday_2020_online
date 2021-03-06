package student_anvars_intezars.home_tasks.lesson_12.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AccessDeniedException extends RuntimeException{

    private String invalidUid;

    public AccessDeniedException(String message, String invalidUid) {
        super(message);
        this.invalidUid = invalidUid;
    }

    public AccessDeniedException() {

    }

    public String getInvalidUid() {
        return invalidUid;
    }
}


