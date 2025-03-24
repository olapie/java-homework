package com.olapie.homework.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void hashMap() {
        Map<Integer[], Integer> map = new HashMap<>();
        Integer[] a = new Integer[]{1, 2};
        Integer[] b = new Integer[]{1, 2};
        map.put(a, 1);
        map.put(b, 2);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(Arrays.hashCode(a));
        System.out.println(Arrays.hashCode(b));
        System.out.println(map.get(a));
        System.out.println(map.get(b));
    }

}
