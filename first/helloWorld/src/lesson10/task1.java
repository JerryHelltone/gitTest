package lesson10;

import lesson10.util.UniqueUtil;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,3,1,2,3,7,2,15,15);
        int result = UniqueUtil.countList(list);
        System.out.println(result);
    }


}
