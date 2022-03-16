package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage());
        Weapon weapon = new Weapon();
        weapon.setWeaponType("tommy-gun");
        weapon.setWeaponName("Kalashnikov-47");
        boss.setBossWeapon(weapon);
        System.out.println("Boss weapon: " +
                boss.getBossWeapon().getWeaponType() + ": " + boss.getBossWeapon().getWeaponName());
    }
}
