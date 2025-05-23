package org.example;

public class Task1 {
    public static void main(String[] args){
        int[] arr = {10 , 9 , 8, 7 , 6, 15, 16, 17, 18};
        System.out.println(Point(arr));



    }
    public static int Point(int[] arr) {
        int right = arr.length - 2;
        int left = 0;

        while (left < right){
            int middle = left + (right - left)/ 2;
            if (arr[middle] > arr[middle + 1]){
                left = middle + 1;

            }else{
                right = middle;

            }
        }
        return left;
    }



}
