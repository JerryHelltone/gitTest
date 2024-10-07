package lesson7.hero;

import lesson7.hero.weapon.RangeWeapon;

public class Archer <ONLY_RANGE extends RangeWeapon>extends Hero <ONLY_RANGE>{

    public Archer(String name, int health) {
        super(name, 10, health);

    }

    @Override
    public void attackEnemy(Enemy enemy){

        System.out.printf("%s пускает стрелу %s\n", getName(), enemy.getName());
        applyDamage(enemy);
    }

}
