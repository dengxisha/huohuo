package com.demo;

public class doMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("lalala");
        hero.setAge(33);
        Weapon weapon=new Weapon("多兰剑");
        hero.setWeapon(weapon);

    }
}
