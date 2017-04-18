package ConceptsImplements;

public class Child_1 {

	static int i = 10, j = 20;

	public static void main(String[] args) {
		Child_1 chld = new Child_1();
		chld.sum(i, j);
	}

	public int sum(int i, int j) {
		int Sum = i + j;
		System.out.println(Sum);
		return Sum;

	}
}
