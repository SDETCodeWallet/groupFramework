package testData;

public class ParentClass {

	protected static int m1() {
		System.out.println("Parent Method: m1");
		int j = 10;
		return j;
	}

	public void m2() {
		System.out.println("Parent Methid m2");
	}

	public static int m4(int a) {
		System.out.println("first m4");
		return a;
	}

	public static String m4(String test) {
		System.out.println("second m4");
		return test;
	}

	public static void main(String[] args) {
		String returnvalue = m4("inside string method");
		System.out.println("Return string valu:" + returnvalue);
		int j = m4(10);
		System.out.println("Return Vlaue of int:" + j);
	}
}
