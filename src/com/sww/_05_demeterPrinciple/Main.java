package com.sww._05_demeterPrinciple;

/**
 * （A）迪米特原则定义：一个对象应该对其他对象保持最少的了解 （也叫最少知道原则）
 *      （1）强调只和朋友交流，不和陌生人说话
 *      （2）朋友：出现在成员变量，方法的输入，输出参数中的类称为成员朋友类，出现在方法体内部的类不属于朋友类
 *      （3）通俗的讲就是：不该和它交流的类就不要和它交流
 *
 * （B）优点： 减少了类之间的耦合。（尽量降低类之间的耦合时可以采取该方式进行优化）
 */
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.learAboutTeamNumber(new TeamLeader());
    }

}
