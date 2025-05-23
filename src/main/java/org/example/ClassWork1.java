package org.example;

import java.util.Arrays;

public class ClassWork1 {
    public static void main(String[] args) {

        public static void sort012 ( int[] nums){
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while (mid <= high) {
                switch (nums[mid]) {
                    case 0:

                        swap(nums, low, mid);
                        low++;
                        mid++;
                        break;
                    case 1:

                        mid++;
                        break;
                    case 2:

                        swap(nums, mid, high);
                        high--;
                        break;
                }
            }
        }

        private static void swap ( int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public static void main (String[]args){
            int[] arr = {1, 0, 0, 2, 1, 2, 1};
            System.out.println("До сортировки: " + Arrays.toString(arr));

            sort012(arr);

            System.out.println("После сортировки: " + Arrays.toString(arr));

        }
    }
}
