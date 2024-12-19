package com.somethingnew;

import java.util.Arrays;

public class ThirdHighInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 66, 224, 66, 35 };
		Arrays.sort(arr);
		int distinctCount = 0;
		int thirdHighest = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
				distinctCount++;
				if (distinctCount == 3) {
					thirdHighest = arr[i];
					break;
				}
			}
		}

		if (distinctCount < 3) {
			System.out.println("Less than 3 distinct elements in the array");
		} else {
			System.out.println(thirdHighest);
		}
	}
}
