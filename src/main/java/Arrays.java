public class Arrays {
	public static String arrayFormat(int input[]) {
		String x = "(";
		for (int i = 0; i < input.length - 1; i++) {
			x += (input[i] + ", ");
		}
		x += (input[input.length - 1]);
		x += (")");
		return x;
	}

	public static void main(String[] args) {
		int input[] = { 2, 4, 38, 91, 9 };
		System.out.println (arrayFormat(input));
	}
}