package com.sww._02_dependenceInversionPrinciple;

/**
 * 定义：高层调用低层，调用即依赖，依赖低层的抽象
 * Man作为高层；学习行为为低层；
 * Man调用抽象的学习行为
 *
 * 方式：构造函数对成员变量【抽象】传参；
 *       set方法对成员变量【抽象】传参；
 *       方法对局部变量【抽象传参】
 */
public class Man {

    public void studyCourse(IStudyCourse studyCourse) {
        studyCourse.studyCourse();
    }

}
