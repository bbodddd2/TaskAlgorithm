package org.example;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args ){
        int[] array = {1, 2, 1, 4, 5};
         int k = 12;
         check(array, k);
    }
    public static boolean check(int[] array , int count0){
        HashMap<Integer, Integer> index = new HashMap<>();
        for(int i = 0; i < array.length; i ++){
            int number = array[i];
            if(index.containsKey(number) && (i - index.get(number)) <= count0){
                System.out.println("True: " + index.get(number) + " " + i );
            }
            index.put(number, i);


        }
        System.out.println("False");
        return false;

    }
}
