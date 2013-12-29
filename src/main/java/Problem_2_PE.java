public class Problem_2_PE {

	public static int sum(int fold, int fold2, int fnew, int limit) {
		int sum = 0;
		while (fnew <= limit) {
			fnew = fold + fold2;
			fold2 = fold;
			fold = fnew;
			if (fnew <= limit) {
				if (fnew % 2 == 0)
					sum += fnew;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(1, 1, 0, 4000000));
	}

	/**
	 * public static void fib() { int fold = 1; int fold2 = 1; int fnew = 0; int
	 * sum = 0; while (fnew <= 4000000) { fnew = fold + fold2; fold2 = fold;
	 * fold = fnew; if (fnew <= 4000000) { if (fnew % 2 == 0) sum += fnew; } }
	 * System.out.print(sum); }
	 * 
	 * public static void main(String[] args) { fib(); }
	 **/
}
