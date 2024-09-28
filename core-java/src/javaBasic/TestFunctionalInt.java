package javaBasic;

public class TestFunctionalInt implements FunctionalInt {

	@Override
	public int doStuff(int a, int b) {
		return a * b;
	}
	
	
	public static void main(String[] args) {
		TestFunctionalInt f = new TestFunctionalInt();
		
		int a =10;
		int b =5;
		f.add(a, b);
		FunctionalInt.sub(a, b);
		System.out.println(f.doStuff(a, b));
		
		
	}
}
