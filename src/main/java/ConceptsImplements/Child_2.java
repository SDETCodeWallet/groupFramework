package ConceptsImplements;

public class Child_2 {

	/*
	 * Final Variable also need to intialize before use. Final Variable value
	 * can also be assign in constructor block or in sttic block. Final variable
	 * cannot be changed.
	 */

	final static int a = 10, b = 50, c = 30;
	final static int j;

	// public Child_2(int rum) {
	// j = rum;
	// }

	public int m1(int a, int b) {

		System.out.println(j);
		int sum;
		sum = a + b;
		return sum;
	}

	public static int m1(int a, int b, int c) {

		int sum;
		sum = a + b + c;
		return sum;
	}

	public static void main(String[] args) {
		Child_2 obj = new Child_2();
		obj.m1(10, 20);

		int sum = obj.m1(a, b);
		int sum2 = obj.m1(a, b, c);
		System.out.println("Finl Value" + sum);
		System.out.println("Second Final Value:" + sum2);

	}

	static {
		j = 100;
	}
}
