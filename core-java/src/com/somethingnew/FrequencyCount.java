package com.somethingnew;
import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 1, 4, 4, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies: " + frequencyMap);
    }
}
