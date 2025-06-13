package org.example;

import java.util.Arrays;

public class LastHomeWork1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findBestTriplet(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }

    public static int[] findBestTriplet(int[] numbers, int targetValue) {
        Arrays.sort(numbers);
        int length = numbers.length;
        int closestSum = numbers[0] + numbers[1] + numbers[length-1];
        int[] result = {numbers[0], numbers[1], numbers[length-1]};

        for (int firstIndex = 0; firstIndex < length - 2; firstIndex++) {
            int secondIndex = firstIndex + 1;
            int thirdIndex = length - 1;

            while (secondIndex < thirdIndex) {
                int currentSum = numbers[firstIndex] + numbers[secondIndex] + numbers[thirdIndex];

                if (Math.abs(currentSum - targetValue) < Math.abs(closestSum - targetValue)) {
                    closestSum = currentSum;
                    result[0] = numbers[firstIndex];
                    result[1] = numbers[secondIndex];
                    result[2] = numbers[thirdIndex];
                }

                if (currentSum == targetValue) {
                    return result;
                } else if (currentSum < targetValue) {
                    secondIndex++;
                } else {
                    thirdIndex--;
                }
            }
        }
        return result;
    }
}