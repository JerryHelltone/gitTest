package lesson7.hero.weapon;

import lesson7.hero.Archer;
import lesson7.hero.Hero;

public class GenericsDemo {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас",100);
        checkHero(archer);
    }

    public static <WEAPON extends RangeWeapon> void checkHero(Hero<WEAPON> hero){

    }
}
