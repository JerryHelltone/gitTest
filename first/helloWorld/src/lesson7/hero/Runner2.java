package lesson7.hero;

public class Runner2 {
    public static void main(String[] args) {
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;

        System.out.println(male.ordinal());
        System.out.println(female.ordinal());
        Gender[] values = Gender.values();
        Gender male1 = Gender.valueOf("MALE");

        Mage mage = new Mage("София", 100, Gender.FEMALE);
        mage.attackEnemy(new Zombie(12,"Юрий",123));
    }
}
