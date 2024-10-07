package lesson7.hero;

public class BattleGround2 {
    public static void main(String[] args) {
        Enemy enemy = new Zombie(45, "Василий", 20);
        Hero beastMaster = new BeastMaster("Ваня",25, 100);


        while (enemy.isAlive() && beastMaster.isAlive()) {
            beastMaster.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(beastMaster);

            }
        }
    }

}
