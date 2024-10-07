package lesson9;

import java.util.Comparator;

public class ActorComplexComparator implements Comparator<Actor> {

    private FeeComparator feeComparator = new FeeComparator();
    private LastNameComparator lastNameComparator = new LastNameComparator();

    @Override
    public int compare(Actor o1, Actor o2) {
        int compareResult = feeComparator.compare(o1,o2);
        compareResult = compareResult == 0 ? lastNameComparator.compare(o1,o2) : compareResult;
        compareResult = compareResult == 0 ? o1.compareTo(o2) : compareResult;
        return compareResult;
    }
}
