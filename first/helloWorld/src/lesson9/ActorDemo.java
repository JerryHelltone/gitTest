package lesson9;

import java.util.*;

public class ActorDemo {
    public static void main(String[] args) {
        List<Actor> actors = Arrays.asList(
                new Actor("Брюс", "Ли", 5000),
                new Actor("Вандам", "Жан", 2500),
                new Actor("Арнольд", "Шварцнеггер", 5500),
                new Actor("Брюс", "Ааа", 5000),
                new Actor("Джонни", "Ли", 5000)

        );
        print(actors);

        Collections.sort(actors); //сортировка по firstName
        print(actors);

        actors.sort(new FeeComparator()); //сортировка по fee от меньшего к большему
        print(actors);

        actors.sort(new FeeComparator().reversed() ); // сортировка по fee от большего к меньшему (reverse)
        print(actors);

        actors.sort(new ActorComplexComparator()); //сортировка по всем параметрам
        print(actors);

        actors.sort(Comparator.comparing(Actor::getFee) //сортировка по всем параметрам с помощью технологии Java8
                .thenComparing(Actor::getLastName)
                .thenComparing(Actor::getFirstName));
        print(actors);

        actors.sort(Comparator.comparing(Actor::getFee) //сортировка по всем параметрам с помощью технологии Java8 (reverse)
                .thenComparing(Actor::getLastName)
                .thenComparing(Actor::getFirstName)
                .reversed());
        print(actors);

    }

    private static void print(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor);

        }
        System.out.println();
    }
}
