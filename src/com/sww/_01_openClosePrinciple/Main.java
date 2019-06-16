package com.sww._01_openClosePrinciple;

/**
 * 开放关闭原则：对扩展开放，对修改关闭。
 *  （1）定义接口及接口实现的base类：不可改变不可修改的契约
 *  （2）定义继承至base类的子类：实现扩展
 *
 *  开放关闭原则：对扩展开放，对修改关闭。
 *   （1）直接搞一个模块儿接口类：可以进行模块替换。达到整体功能的扩展。而不是对某一模块采取修改
 */
public class Main {

    public static void main(String[] args) {
        ICourse iCource = new JavaDiscountCource("007", "java课程", 100);
        JavaDiscountCource javaDiscountCource = (JavaDiscountCource) iCource;
        System.out.println("课程id -- " + javaDiscountCource.getId());
        System.out.println("课程名字 -- " + javaDiscountCource.getName());
        System.out.println("课程课程价格 -- " + javaDiscountCource.getOriginPrice());
        System.out.println("课程课程价格 -- " + javaDiscountCource.getDiscountPrice());
    }

}
