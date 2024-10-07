package lesson7.hero;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, 15, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.printf("%s бьёт мечом %s\n", getName(),enemy.getName());
        applyDamage(enemy);
    }

}
