import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstNumberOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		spaceRemover();
		
	}
	
	public static void spaceRemover() {
		
		//create variables
		long[] attendance = new long[261];
		long[] lowRange = new long[261];
		long[] highRange = new long[261];
		ArrayList<Long> over20 = new ArrayList<Long>();
		int arrLen = attendance.length;
		int ctr20 = 0;
		
		// Create scanner
		Scanner s = new Scanner(System.in);
		
		// Collect each number group
		
		for (int i = 0; i < 260; i++) {
			attendance[i] = s.nextLong();
			lowRange[i] = s.nextLong();
			highRange[i] = s.nextLong();
		}
		
		// Print out array length
		System.out.println(arrLen);
		
		// Remove sub 40s
		for (int r = 0; r < arrLen; r++) {
			if (attendance[r] > 40) {
				over20.add(attendance[r]);
				ctr20++;
			}	
		}
		
		System.out.println(over20);
		System.out.println(ctr20);
		
	}

}
