package string_practicals;

import java.util.Arrays;

public class RemoveIntFromStringHoldInIntegerArray {
	public static void main(String[] args) {
		String name = "rays1234";
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				result = result +(name.charAt(i));
			}
		}
		
		int [] arr = new int [result.length()];
		for (int i = 0; i < result.length(); i++) {
			arr[i]= Character.getNumericValue(result.charAt(i));
		}
		System.out.println(Arrays.toString(arr));
	}
}
