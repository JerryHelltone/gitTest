package lesson7.hero;

import lesson7.hero.weapon.Weapon;

public abstract class Hero <WEAPON extends Weapon> implements Mortal {

    private String name;
    private int damage;
    private int health;
    private WEAPON weapon;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public boolean isAlive(){return health > 0;}

    @Override
    public void kill(){
        System.out.println(getName() + " умирает!");
        this.health = 0;
    }

    public void takeDamage(int damage) {
        System.out.println(getName() + " получает " + damage + " урона");
        if(damage >= health) {
            kill();
        }else {
            this.health -= damage;
        }
    }

    public abstract void attackEnemy(Enemy enemy);

    public void applyDamage(Enemy enemy){
        enemy.takeDamage(damage);
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public WEAPON getWeapon() {
        return weapon;
    }

    public void setWeapon(WEAPON weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", weapon=" + weapon +
                '}';
    }
}
