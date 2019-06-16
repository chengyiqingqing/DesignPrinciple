package com.sww._06_LisSubstitutionPrinciple;

/**
 * 定义：父类能出现的地方，子类都能出现；
 * 特点：Parent parent = new Child();
 *          父类的声明，但是子类覆盖父类的方法。
 *
 * 注意：向上转型时，是不能调用子类拥有父类没有的方法的。
 */
public class Main {

    public static void main(String[] args) {
        Solider solider = new Solider();
        AbstractGun abstractGun = new HandGun();
        solider.shoot(abstractGun);
        solider.shoot(new MachineGun());
    }

}
