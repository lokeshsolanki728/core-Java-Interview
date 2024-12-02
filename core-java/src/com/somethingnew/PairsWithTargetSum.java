package com.somethingnew;
import java.util.HashSet;

public class PairsWithTargetSum {
    public static void findPairs(int[] array, int target) {
        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Pairs with sum " + target + ":");
        for (int num : array) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 3, 7, 5, -1};
        int target = 6;
        findPairs(array, target);
    }
}
