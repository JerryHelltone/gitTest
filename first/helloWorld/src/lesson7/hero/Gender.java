package lesson7.hero;

public enum Gender implements Description{

    MALE("Мужчина"),
    FEMALE("Женищина");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    @Override
    public  String getDescription(){
        return this.description;
    }
}
