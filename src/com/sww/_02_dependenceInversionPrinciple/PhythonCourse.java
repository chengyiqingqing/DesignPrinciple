package com.sww._02_dependenceInversionPrinciple;

public class PhythonCourse implements IStudyCourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Phython课程");
    }

}
