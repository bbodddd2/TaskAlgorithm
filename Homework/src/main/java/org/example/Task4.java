package org.example;

import java.util.Arrays;
import java.util.Map;

public class Task4 {
    public static void main(String[] args){
        int[] arr = {15, 5, 11, 10, 12};
        System.out.println(MaxCount(arr, 30));


    }
    public static int MaxCount(int [] arr, int s){
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            if(sum + arr[i] <= s){
                sum += arr[i];
                count ++;
            }else{
                break;
            }

        }
        return count;

    }
}
