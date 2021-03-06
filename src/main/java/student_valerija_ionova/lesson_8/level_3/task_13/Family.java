package student_valerija_ionova.lesson_8.level_3.task_13;

//Придумайте и создайте абстрактный класс и его потомков.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Family {

    private String surName;

    private String address;

    public Family(String surName, String address){
        this.surName = surName;
        this.address = address;
    }

    abstract String introduceYourself();

}
