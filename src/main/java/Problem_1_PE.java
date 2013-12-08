public class Problem_1_PE {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int i;
		{

			for (i = 3; i < 1000; i += 3)
				a += i;

			for (i = 5; i < 1000; i += 5)
				b += i;

			for (i = 15; i < 1000; i += 15)
				c += i;

			int Sum = a + b - c;

			System.out.println(Sum);
		}
	}
}