package com.sww._04_interfaceSegretionPrinciple;

/**
 * 接口隔离原则定义：
 * （1）同单一原则相似，但不同。
 * （2）单一职责，指类，接口，方法只做一件事儿。即为引起该单一模型发生变化的只能是一件事情
 * （3）而接口隔离，就是将接口尽量最小化。接口做一件儿事情或一类事情。
 *      具体表现就是所有子类实现该接口，不能出现实现方法为空方法。出现空方法就意味着不符合该方法
 * <p>
 * 对应场景：
 * （1）动物行为接口interface：eat()，fly()，swim() 三种行为。
 * （2）动物有鸭子eat(),swim();
 *      小鸟eat(),fly();
 * （3）定义三种接口，而非一种：IActionEat，IActionFly，IActionSwim
 */
public class Main {

}
