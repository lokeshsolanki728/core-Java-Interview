package com.somethingnew;
public class MajorityElement {
    public static int findMajorityElement(int[] array) {
        int candidate = array[0], count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == candidate) count++;
            else if (--count == 0) {
                candidate = array[i];
                count = 1;
            }
        }

        count = 0;
        for (int num : array) {
            if (num == candidate) count++;
        }

        return count > array.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 2,1,1};
        System.out.println("Majority Element: " + findMajorityElement(array));
    }
}
