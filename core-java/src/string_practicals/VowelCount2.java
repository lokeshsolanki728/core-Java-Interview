package string_practicals;

public class VowelCount2 {
	public static void main(String[] args) {
		char ch[] = { 'a', 'e', 'i', 'o', 'u' };
		String str = "introduction";
		int arr[] = new int[5];
		for (int j = 0; j < ch.length; j++) {
			for (int i = 0; i < str.length(); i++) {
				if (ch[j] == str.charAt(i)) {
					arr[j]++;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i] + " = " + arr[i]);
		}
	}
}
