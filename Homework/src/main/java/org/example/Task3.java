package org.example;

import java.util.Arrays;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largest(nums));
    }

    public static String largest(int[] nums) {

        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        if (str[0].equals("0")) return "0";
        StringBuilder result = new StringBuilder();
        for (String num : str) {
            result.append(num);
        }

        return result.toString();
    }

}

