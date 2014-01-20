public class Arrays {
	public static void ArrayFormat(int input[]) {
		System.out.print("(");
		for (int i = 0; i < input.length - 1; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.print(input[input.length - 1]);
		System.out.print(")");
	}

	public static void main(String[] args) {
		int input[] = { 2, 4, 38, 91, 9 };
		ArrayFormat(input);
	}
}