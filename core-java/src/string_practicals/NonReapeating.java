package string_practicals;

public class NonReapeating {
	public static void main(String[] args) {
		String str = "lokkesh";
		int aa = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			aa++;
			for (int j = aa; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					System.out.println(str.charAt(j));
				}
			}
		}
	}
}
