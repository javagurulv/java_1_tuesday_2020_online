package student_jaroslav_brutan.lesson_12.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(Role ... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    @CodeReviewComment(teacher = "Not informative method name! Rename it!")
    // Updated
    boolean hasRole(Role role){

        return roles.contains(role);
    }
}
