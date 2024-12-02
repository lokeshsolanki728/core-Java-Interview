package com.somethingnew;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : array) {
            set.add(num);
        }

        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
