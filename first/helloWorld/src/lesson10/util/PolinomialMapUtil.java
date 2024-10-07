package lesson10.util;

import java.util.*;

public final class PolinomialMapUtil {

    private void PolinomailMapUtil(){

    }

    public static String calculateStringValues(Map<Integer, Integer> map){
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.reverseOrder());
        for (Integer key : list) {
            Integer integer = map.get(key);
            if(integer != null){
                stringBuilder.append(integer);
                        if(key != 0){
                            stringBuilder.append("x^").append(key);
                        }
            }
            stringBuilder.append("+");
        }
        return null;
    }
}
