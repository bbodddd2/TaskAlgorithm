package org.example;

import static java.util.Collections.reverse;

public class Task2 {
    public static void main(String[] args) {
        char[] s = "the sky is blue".toCharArray();
        reverse(s, 0, s.length - 1);


        int i = 0, n = s.length;
        while (i < n) {
            while (i < n && s[i] == ' ') i++;
            int start = i;
            while (i < n && s[i] != ' ') i++;
            reverse(s, start, i - 1);
        }
        System.out.println(new String(s));
    }

    public static void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
