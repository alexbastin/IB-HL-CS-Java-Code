import java.util.Arrays;

public class MathHomeworkGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] values = {114, 285, 22.5, -243, -34, 300, -100, 225, 78, -150, -300, 25, 420, 50, 690, 120, 120, 67.5};
		ReferenceAndCoterminal(values);
		
	}

	public static void ReferenceAndCoterminal(double[] values) {
	
		
		for (int i = 0 ; i < values.length; i++) {
			
			while (values[i] > 360) {
				values[i] = values[i] - 360.0;
			}
			System.out.println(i + 1 + ".)");
			double angle = values[i];
			double postAngle = values[i];
			
			System.out.println("Given Angle is " + angle);
			
			double referenceAngle = 0;
			
			
			if (angle < 0) {
				angle = angle * -1;
			}
			
			if (angle < 90) { //q1
				referenceAngle = angle;
			} else if (angle < 180) { //q2
				referenceAngle = 180 - angle;
			} else if (angle < 270) { //q3
				referenceAngle = angle - 180;
			} else {
				referenceAngle = 360 - angle;
			}
		
			
			if (angle < 0) {
				angle = angle * -1;
			}
			
			System.out.println("Reference angle is " + referenceAngle);
			System.out.println("First coterminal angle is " + (postAngle));
			if (postAngle < 0) {
				System.out.println("Second coterminal angle is " + (postAngle + 360));
			} else {
				System.out.println("Second coterminal angle is " + (postAngle - 360));
			}
			System.out.println(".............................");
			
			
			
			
			
			
			
			
			
		}
		System.out.println(Arrays.toString(values));
		
	}

}
