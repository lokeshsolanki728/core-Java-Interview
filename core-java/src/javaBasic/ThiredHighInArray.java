package javaBasic;

public class ThiredHighInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 43, 224, 66, 35 };
		int temp = 0, temp1 = 0, temp2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (temp < arr[i]) {
				temp = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (temp1 < arr[i] && arr[i] < temp) {
				temp1 = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (temp2 < arr[i] && arr[i] < temp1 && arr[i] < temp) {
				temp2 = arr[i];
			}
		}
		System.out.println(temp2);
	}
}
