package lesson7.hero;

public class BeastMaster extends Hero{

    private Wolf wolf;

    public BeastMaster(String name, int damage, int health) {
        super(name, damage, health);
        this.wolf = new Wolf("Волк",30,50);
    }

    @Override
    public void takeDamage(int damage) {
        if(wolf.isAlive()){
            wolf.takeDamage(damage);
        }else {
            super.takeDamage(damage);
        }

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (wolf.isAlive()) {
            wolf.attackEnemy(enemy);
        }else {
            System.out.println(getName() + " атакует " + enemy.getName());
            applyDamage(enemy);
        }
    }

    public class Wolf extends Hero{

        public Wolf(String name, int damage, int health) {
            super(name, damage, health);
        }

        @Override
        public void attackEnemy(Enemy enemy) {
            System.out.println(getName() + " атакует " + enemy.getName());
            applyDamage(enemy);
        }
    }
}
