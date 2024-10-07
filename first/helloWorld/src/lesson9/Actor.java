package lesson9;

import java.util.Objects;

public class Actor implements Comparable<Actor>{
    private String firstName;
    private String lastName;
    private int fee;

    public Actor(String firstName, String lastName, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    @Override
    public int compareTo(Actor o) {
        return this.firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return fee == actor.fee && Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fee);
    }
}
