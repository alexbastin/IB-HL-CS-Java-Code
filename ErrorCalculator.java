import java.util.Scanner;

public class ErrorCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		errorCalculator();
	}
	
	public static void errorCalculator() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("What is the predicted value? ");
		float predicted = s.nextFloat();
		System.out.println("What is the expected value? ");
		float expected = s.nextFloat();
		
		float error = (predicted - expected)/expected;
		float percentageError = error * 100;
		
		System.out.println("Raw error is: " + error);
		System.out.println("Percentage error is: " + percentageError + "%");
	
	
	}

}
