package lesson11;

import lesson9.Actor;
import lesson9.LastNameComparator;

public class task1 {
    public static void main(String[] args) {
        Actor actor = null;
        try{
            String lastName = actor.getLastName();
            System.out.println(lastName);
        } catch (NullPointerException exc) {
            exc.printStackTrace();
        }
    }
}
