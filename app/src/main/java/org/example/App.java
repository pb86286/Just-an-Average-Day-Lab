package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 2, 7};

        System.out.println("Max using for loop: " + maximumUsingForLoop(nums));
        System.out.println("Min using for loop: " + minimumUsingForLoop(nums));
        System.out.println("Sum using for loop: " + sumUsingForLoop(nums));
        System.out.println("Average using for loop: " + averageUsingForLoop(nums));

        System.out.println("Max using streams: " + maximumUsingStream(nums));
        System.out.println("Min using streams: " + minimumUsingStream(nums));
        System.out.println("Sum using streams: " + sumUsingStream(nums));
        System.out.println("Average using streams: " + averageUsingStream(nums));
    }

    
    public static int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static int averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums) / nums.length;
    }

    // Stream API implementations
    public static int maximumUsingStream(int[] nums) {
        return Arrays.stream(nums).max().orElseThrow();
    }

    public static int minimumUsingStream(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow();
    }

    public static int sumUsingStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static int averageUsingStream(int[] nums) {
        return (int) Arrays.stream(nums).average().orElseThrow();
    }
}
