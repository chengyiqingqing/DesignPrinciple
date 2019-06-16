package com.sww._06_LisSubstitutionPrinciple;

public class Solider {

    /**
     * 父类能出现的地方，子类都能出现
     */
    public void shoot(AbstractGun gun) {
        gun.shoot();
    }

}
