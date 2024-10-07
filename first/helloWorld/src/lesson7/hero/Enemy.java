package lesson7.hero;

public abstract class Enemy implements Mortal {

    private String name;
    private int health;
    private int damage;

    public Enemy(int health, String name, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attackHero(Hero hero){
        System.out.printf("%s бьёт %s\n", getName(),hero.getName());
        hero.takeDamage(damage);
    }

    public abstract void takeDamage(int damage);

    @Override
    public void kill(){
        System.out.println(getName() + " умирает!");
        this.health = 0;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

