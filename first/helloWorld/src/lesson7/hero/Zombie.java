package lesson7.hero;

public class Zombie extends Enemy{

    private boolean dieOnce;

    public Zombie(int health, String name, int damage) {
        super(health, name, damage);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(getName() + " получает " + damage + " урона");
        if(damage >= getHealth()) {
            if (dieOnce){
                kill();
            }else {
                dieOnce = true;
                setHealth(50);
                System.out.println(getName() + " воскрес, здоровье равно " + getHealth());
            }
        }else {
          int newHealth = getHealth();
            newHealth-=damage;
            setHealth(newHealth);
        }
    }
}
