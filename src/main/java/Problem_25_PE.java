public class Problem_25_PE {

	public static void fib() {
		int fold = 1;
		int fold2 = 1;
		int fnew = 0;
		int sum = 0;
		while (fnew <= 4000000) {
			fnew = fold + fold2;
			fold2 = fold;
			fold = fnew;
			if (fnew <= 4000000) {
				if (fnew % 2 == 0)
					sum += fnew;
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		fib();
	}
}
