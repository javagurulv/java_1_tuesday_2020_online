package student_eduards_jasvins.lesson_9.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }


}
