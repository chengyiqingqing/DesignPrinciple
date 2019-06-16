package com.sww._02_dependenceInversionPrinciple;

public class JavaScriptCourse implements IStudyCourse {

    @Override
    public void studyCourse() {
        System.out.println("学习javaScript课程");
    }

}
