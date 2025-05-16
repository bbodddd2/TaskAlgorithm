package org.example;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 23, 2, 4, 34, 3, 45, 8};
        int[] array2 = {2, 3, 3, 34, 5, 3, 2, 77, 46};
        List<Integer> commonElements = Element(array1, array2);
        System.out.println(commonElements);
    }


    private static Map<Integer, Integer> createMap(int[] array) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int num : array) {
            newMap.put(num, newMap.getOrDefault(num, 0) + 1);
        }
        return newMap;

    }

    public static List<Integer> Element(int[] array1, int[] array2) {
        Map<Integer, Integer> period1 = createMap(array1);
        Map<Integer, Integer> period2 = createMap(array2);
        List<Integer> result = new ArrayList<>();


        for (int num : period1.keySet()) {
            if (period2.containsKey(num)) {
                int periodMin = Math.min(period1.get(num), period2.get(num));
                for (int i = 0; i < periodMin; i++) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}
