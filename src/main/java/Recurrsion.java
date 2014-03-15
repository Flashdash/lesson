public class Recurrsion {
	public static int sum(int total, int multiplicant, int n) {
		total*=multiplicant;
		multiplicant++;
		
		if(multiplicant<=n)
			return sum (total, multiplicant++, n);
		else
			return total;
	}
	public static int sum(int n)
	{
		return sum (1, 1, n);
	}
	public static void main(String[] args) {
		System.out.println(sum (4));
	}
}
