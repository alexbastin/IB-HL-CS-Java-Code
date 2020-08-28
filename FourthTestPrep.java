public class FourthTestPrep {

	public static void main(String[] args) {
		
		System.out.println("Result: " + example1(5));
		
		System.out.println("Result: " + example2(3,2,6));
		
		System.out.println("Result: " + mystery(5));
		


	}
	
	public static int example1 (int a) {
		
		if (a == 1) 
			return 2;
		else
			return 2 * example1(a - 1);
	}
	
	public static int example2(int n, int a, int d) {
		
		if (n == 1) 
			return a;
		else 
			return d + example2(n - 1, a, d);		
		
	}
	
	public static int mystery(int n) {
		if ((n > 0) || (n % 2 == 0)) {
			mystery(n - 2);
		}

		return n;
	}
	

}
