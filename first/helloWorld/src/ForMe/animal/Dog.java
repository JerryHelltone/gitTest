package ForMe.animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void voice(){
        System.out.println(getName() + " лает");
    }

    public void jump(){
        System.out.println(getName() + " прыгает");
    }

    public void run(){
        System.out.println(getName() + " бегает");
    }

    public void bite(){
        System.out.println(getName() + " кусается");
    }

}
