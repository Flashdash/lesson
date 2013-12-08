public class Problem_1_PE {
	public static int sum(int start, int end, int inc) {
		int sum = 0;
		for (int i = start; i < end; i += inc)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(3, 1000, 3) + sum(5, 1000, 5) - sum(15, 1000, 15));
	}
}