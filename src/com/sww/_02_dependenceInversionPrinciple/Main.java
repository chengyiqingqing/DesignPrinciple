package com.sww._02_dependenceInversionPrinciple;

/**
 * 定义：高层模块不应该依赖低层模块，二者都应该依赖抽象
 * （1）抽象不应该依赖细节；细节应该依赖抽象
 * （2）针对接口编程，不要针对实现编程
 * 优点：减少类间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险
 */
public class Main {

    /**
     * version 1
     */
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.studyJavaScriptCourse();
//        person.studyPhythonCourse();
//    }

    /**
     * version 2
     */
    public static void main(String[] args) {
        Man man = new Man();
        man.studyCourse(new JavaScriptCourse());
        man.studyCourse(new PhythonCourse());
    }

}
