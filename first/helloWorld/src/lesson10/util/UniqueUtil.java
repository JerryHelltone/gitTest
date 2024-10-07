package lesson10.util;

import java.util.*;


public final class UniqueUtil {

    private UniqueUtil() {
    }
    
    public static int countList(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }

    public static boolean isUnique(Map<String, String> map){
        Collection<String> values = map.values();
        HashSet<String> uniqueValues = new HashSet<>(values);

        return map.size() == uniqueValues.size();
    }
}
