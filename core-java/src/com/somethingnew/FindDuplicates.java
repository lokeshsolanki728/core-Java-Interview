package com.somethingnew;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3};
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicates: ");
        for (int num : array) {
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
