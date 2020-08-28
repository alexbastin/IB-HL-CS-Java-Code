import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.stream.DoubleStream;
import java.lang.Math;
import java.sql.Time;
import java.util.ArrayList;
import java.time.Duration;

public class ToolsClass { // right click on the plus/minus to collapse all blocks

	/** KEY CODING IDEAS:
	 * 
	 * Single "=" is for assigning variables data
	 * Double "==" is for comparing variables
	 * 
	 * For arrays and non-primitve data types, convert it to
	 * a string within the main instead of inside the method
	 * so remains that non-primitive data type, not a string
	 */
	
	public static void main(String[] args) {
		
		//APR 28, 2020 - Words in sentence - DOESNT WORK
			System.out.println(wordSentence("Hey there"));
			
			
		//	System.out.println(Arrays.toString(list.toArray()));
		
		//APR 10, 2020 - Reference and coterminal angles - WORKS
		//double[] values = {114, 285, 22.5, -243, -34, 300,
		//		-100, 225, 78, -150, -300, 25, 420, 50, 
		//		690, 120, 120, 67.5};
		//	referenceAndCoterminal(values);
		
		//MAR 18, 2020 - Prime Finder - WORKS
		//	System.out.println(primeFinder(1000000));
		
		//MAR 3, 2020 - Tower of Hanoi - WORKS
		//	Format is: n, fromRod, toRod, auxRod
		//	hanoi(5, 'A', 'B', 'C');
		
		//MAR 2, 2020 - String cleanup - WORKS
		//	System.out.println(stringCleanup("hhheeeeyyyy youuu"));
		
		//MAR 2, 2020 - No "x" in string - WORKS
		//	System.out.println(noX("JxAxVxA xOOxPx"));
		
		//MAR 2, 2020 - Fibonacci numbers - WORKS
		//	System.out.println(recursionFibo(18));
		
		//FEB 29, 2020 - Circular primes - WORKS
		//	System.out.println(circularPrimes(1000000));
		
		//FEB 29, 2020 - Number rotation - WORKS
		//	System.out.println(Arrays.toString(rotation(234)));
		//	Converting to a string within the main; very important
		
		//FEB 29, 2020 - Is prime? - WORKS
		//	System.out.println(isPrime(a));
		
		//FEB 28, 2020 - Insertion sort - WORKS
		//	int a[] = {9, 5, 2, 8, 3, 6, 1, 0, 4, 7};
		//	System.out.println(insertionSort(a));
		
		//FEB 15, 2020 - Bogo sort - WORKS
		//	int b[] = {9, 5, 2, 8, 3, 6, 1, 0, 4, 7};
		//	System.out.println(bogoSort(b));
		
		//FEB 15, 2020 - Code Execution Timer - WORKS
		//	try {
		//		codeTimer();
		//	} catch (InterruptedException e) {
		//		e.printStackTrace();
		//	}
		
		//FEB 14, 2020 - Array sorted test - WORKS
		//	int abcd[] = {1, 2, 5, 7, 1};
		//	System.out.println(arraySorted(abcd));
		
		//FEB 12, 2020 - S1 CCC Question - WORKS
		//	S1CCC();
		
		//FEB 12, 2020 - Selection Sort - WORKS
		//	int f[] = { 9, 5, 2, 8, 3, 6, 1, 0, 4, 7 };
		//	selectionSort(f);
		
		//FEB 11, 2020 - Bubble sort - WORKS
		//	int[] a = {-8, 10, 3, -1, 99, -12, 87, 35, 27};
		//	bubbleSort(a);
		
		//FEB 6, 2020 - Linear Search - WORKS
		//	int[] a = {4, 3, 7, 5, 6, 4, 4};
		//	System.out.println(linearSearch(a, 5));
			
		//JAN 9, 2020 - Random capitals - WORKS?
		//	System.out.println(randomCaps("Hey there my name is Alex"));
			
		//JAN 9, 2020 - Verify emails - WORKS?
		//	System.out.println(emailVerification("alex.bastin@ucc.on.ca"));

		//JAN 8, 2020 - Replacing string with "xxx" - WORKS
		//	String result = ToolsClass.replaceWithXXX("apple");
		//	System.out.println(result);
		
		//JAN 8, 2020 - Searching for string - WORK
		//	Stack<String> Attendees = new Stack<String>();
		//	Attendees.push("Sophie");
		//	Attendees.push("Zara");
		//	Attendees.push("Abed");
		//	Attendees.push("Ryan");
		//	Attendees.push("Rick");
		//	Attendees.push("Jane");
		//	Attendees.push("Mia");
		//	Attendees.push("Troy");
		//	int a = ToolsClass.searchStack(Attendees, "Abd");
		//	System.out.println(a);
		
		//JAN 6, 2020 - Finding sum of all primes in a queue - WORKS
		//	Queue<Integer> reportCard = new LinkedList<Integer>();
		//	Random r = new Random();
		//	
		//	for (int d = 0; d < 6; d++) {
		//		reportCard.add(r.nextInt(100-80) + 80);
		//	}
		//		
		//	System.out.println(sumPrimesInQueue(reportCard));
			
		//JAN 5, 2020 - Reversing a queue - WORKS
		//	Queue<String> days = new LinkedList<String>();
		//	days.add("Monday");
		//	days.add("Tuesday");
		//	days.add("Wednesday");
		//	days.add("Thursday");
		//	days.add("Friday");
		//	days.add("Saturday");
		//	days.add("Sunday");
		//	reverseQueue(days);
		
		//JAN 5, 2020 - Sorting with a stack- WORKS
		//	Stack<String> classes = new Stack<String>();
		//	classes.push("HL Physics");
		//	classes.push("HL Computer Science");
		//	classes.push("HL Economics");
		//	classes.push("SL English");
		//	classes.push("SL Math");
		//	classes.push("SL Spanish");
		//	stackSort(classes);
		
		//JAN 5, 2020 - Reversing a stack - WORKS
		//	Stack<String> words = new Stack<String>();
		//	words.add("Hola");
		//	words.add("soy");
		//	words.add("Alex!");
		//	reversingStack(words);
				
		//DEC 30, 2019 - Printing a 2D array in column major - WORKS
		//	System.out.println(print2DColumnMajor(arr));
		
		//DEC 27, 2019 - Converts base 10 to base 2 - WORKS
		//	System.out.println(base10to2(a));
		
		//DEC 18, 2019 - Finding the sum of all multiples of 3 and 5 - WORKS
		//	System.out.println(multiple3and5(10));
	
		//DEC 14, 2019 - Finds the IQR of an array - WORKS
		//	double c[] = {9.0, 2.0, 8.0, 3.0, 17.0, 10.0, 38.0, 63.0, 28.0, 10.0};
		//	System.out.println(findIQR(c));
		
		//DEC 13, 2019 - Finds the Q1 of an array - WORKS
		//	double b[] = {9.0, 2.0, 8.0, 3.0, 17.0, 10.0, 38.0, 63.0, 28.0, 10.0};
		//	System.out.println(findQ1(b));
		
		//DEC 13, 2019 - Finds the Q3 of an array - WORKS
		//	double a[] = {9.0, 2.0, 8.0, 3.0, 17.0, 10.0, 38.0, 63.0, 28.0, 10.0};
		//	System.out.println(findQ3(a));
		
		//DEC 12, 2019 - Finds the range of an array - WORKS
		//	int c[] = {9, 2, 8, 3, 17, 10, 38, 63, 28};
		//	System.out.println(findRange(c));
		
		//DEC 11, 2019 - Finds the mode of an array - WORKS
		//	double a[] = {9.0, 2.0, 8.0, 3.0, 17.0, 10.0, 38.0, 63.0, 28.0, 10.0};
		//	findMode(a);
		
		//DEC 10, 2019 - Finds the median of an array - WORKS
		//	double a[] = {9.0, 2.0, 8.0, 3.0, 17.0, 10.0, 38.0, 63.0, 28.0, 10.0};
		//	System.out.println(findMedian(a));
		
		//DEC 9, 2019 - Finds the mean of an array - WORKS
		//	double a[] = {9.0, 2.0, 8.0, 3.0, 17.0, 10.0, 38.0, 63.0, 28.0, 10.0};
		//	System.out.println(findMean(a));
		
		//DEC 8, 2019 - Finds the max of an array - WORKS
		//	int b[] = {9, 2, 8, 3, 17, 10, 38, 63, 28};	
		//	System.out.println(findMax(b));
		
		//DEC 8, 2019 - Finds the min of an array - WORKS
		//	int a[] = {9, 2, 8, 3, 17, 10, 38, 63, 28};	
		//	System.out.println(findMin(a));			
	
		//DEC 4, 2019 - Reading and analysing a .txt file - WORKS
		//	int[] data = readFiles("randomDataExtract1.txt");
		//	System.out.println(Arrays.toString(data));
		
		//DEC 1, 2019 - Converts base 2 to base 10 - WORKS
		//	System.out.println(base2to10(a));
		
		//DEC 1 , 2019 - Alphabetical Sort - WORKS
		//	String a[] = {"pineapple", "orange", "apple"};
		//	alphaSort(a);
		
		//NOV 29, 2019 - Celcius to fareneheit - WORKS
		//	true = cel - far, false = far - cel
		//	System.out.println(CeltoFar(50, false));
		
		//NOV 29, 2019 - Reverses a string - WORKS
		//	System.out.println(stringReverse("backwards"));
		
		//NOV 29, 2019 - Finding vowels - WORKS
		//	System.out.println(isVowel("a"));
			
		// NOV 29, 2020 - Finding all primes in a number
		//	System.out.println(findPrimes(100));
			
		//NOV 29, 2019 - Splits a string - WORKS
		//	System.out.println(stringSplitter("String"));
		
		//NOV 28, 2019 - Creating a spiral array - MIGHT WORK?
		/*
		int[][] spiral = spiralArray(4);
		for (int i = 0; i < spiral.length; i++) {
			for (int j = 0; j < spiral[0].length; j++) {
				System.out.print(spiral[i][j] + " ");
			}
			System.out.println("");
		}
		
		Note: Could also use Arrays.ToDeepString(parameter) 
		// "deep" is for 2D arrays
		
		//*/
				
		//NOV 21, 2019 - Integer comparison - WORKS
		//	GuessingGame(a, b);
		//	A is the first value, B is the value it is compared to
		
		//NOV 19, 2019 - Random 2D array - WORK
		//	System.out.println(createRandom2DArray(2, 3));
		
		//NOV 19, 2019 - Printing a 2D array in row major - WORKS
		//	System.out.println(print2DRowMajor(a));
		//	int[][] a = {};
		
		//NOV 18, 2019 - Finding the smallest word - WOKRS
		//	String[] a = {"physics" ,"spanish", "comp sci", "english"};
		//	System.out.println(findArrayDigitSum(a));
		
		//NOV 18, 2019 - Creating a random array - WORKS
		//	System.out.println(createRandomArray(10));
		
		//NOV 17, 2019 - Tests for subsequent integer presence - WORKS
		//	int a[] = {2, 9, 10, 1, 3, 4, 2, 5};
		//	System.out.println(has12(a, 3, 2));
		
		//NOV 16, 2019 - Testing for variable presence in array - WORKS
		//	int a[] = {8,4,8,1,2,5};
		//	System.out.println(inArray(a, 4));
			
		//NOV 16, 2019 - Finding array digit sum for strings - WORKS
		//	String[] = {"physics" ,"spanish", "comp sci", "english"};
		//	System.out.println();
			
		//NOV 15, 2019 - Finding array digit sum - WORKS
		//	int a[] = {45, 98, 32, 73, 12, 23};
		//	System.out.println(findArrayDigitSum(a));
		
		//NOV 15, 2019 - Comparing 3 integer values - WORKS
		//	System.out.println(greenTicket(a, b, c));
		//	Each variable is a ticket number
		
		//NOV 2, 2019 - Calculating range of a projectile - WORKS
		//	System.out.println(findingRange(a, b));  
		//	A is launch velocity, b is launch angle
			
		//NOV 1, 2019 - Creating an endlessly looping method - WORKS
		//	uselessMethod();
		
	} // end of main
	
	
	public static ArrayList<Integer> wordSentence(String sentence) {
		
		ArrayList<Integer> words = new ArrayList<Integer>();
		int wordStart = 0;
		int wordEnd = 1;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				System.out.println("SPACE");
				wordEnd = i;
				
				String word = "";
				for (int g = wordStart; g < wordEnd; g++) {
					word = word + sentence.charAt(g);
				}
				
			}
		}
		
		
		
		
		
		
		
		return words;
	}
	
	/********** APR 10, 2020 - Reference and coterminal angles **********/
	/**
	 * @param double array of angle values
	 * @return an enumeration of the primes of differents classes
	 * 
	 * This method uses an infinitely looping while loop to find primes of a certain class, like marsenne
	 * primes
	 * 
	 * Key takeaways: using a boolean to fuel an infinte while loop, invoking methods (isPrime),
	 * using shorthand notation
	 * 
	 */
	
	public static void ReferenceAndCoterminal(double[] values) {

		for (int i = 0; i < values.length; i++) {

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

			if (angle < 90) { // q1
				referenceAngle = angle;
			} else if (angle < 180) { // q2
				referenceAngle = 180 - angle;
			} else if (angle < 270) { // q3
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

	
	/********** MAR 18, 2020 - Prime finder **********/
	/**
	 * @param none
	 * @return an enumeration of the primes prior to a number
	 * 
	 * This method uses an infinitely looping while loop to find primes of a certain class, like marsenne
	 * primes
	 * 
	 * Key takeaways: using a boolean to fuel an infinte while loop, invoking methods (isPrime),
	 * using shorthand notation
	 * 
	 */	
	
	public static long primeFinder(int nthPrime) {
		
		long incNumber = 0;
		long numberOfPrimes = 0;
		boolean primeFound = false;
		
		while (!primeFound) {
			
			if (isPrime(incNumber)) {
				numberOfPrimes++;
				
				if (numberOfPrimes == nthPrime) {
					return incNumber;
				}
				
			}
			
			
			
			incNumber++;
		}
		
		return 0;
	}
	
	/********** MAR 3, 2020 - Towers of Hanoi **********/
	/**
	 * @param the details about the Tower of Hanoi
	 * @return the step-by-step solution on how to solve it
	 * 
	 * This method takes the details about the variation of the "Towers of Hanoi" game and provides a step-by-step
	 * solution to solve it using RECURSION
	 * 
	 * Key takeaways: solving base cases, calling upon method within method, continually decreasing n
	 * 
	 */
	public static void hanoi(int n, char fromRod, char toRod, char auxRod){
		
		if (n == 1) { // base case
            System.out.println("Move disk 1 from rod " +  fromRod + " to rod " + toRod); 
            return; 
        }
		
        hanoi(n-1, fromRod, auxRod, toRod); 
        System.out.println("Move disk " + n + " from rod " +  fromRod + " to rod " + toRod); 
        hanoi(n-1, auxRod, toRod, fromRod); 
	}
	
	/********** MAR 2, 2020 - String cleanup **********/
	/**
	 * @param a String str
	 * @return str with no adjecently repeated chars
	 * 
	 * This method "cleans" a string by reducing the repetition of adjecent chars to
	 * one char using RECURSION
	 * 
	 * Key takeaways: solving base cases, calling upon method within method, working towards
	 * the base case
	 * 
	 */
	public static String stringCleanup(String dirty) {
		
		if (dirty.length() < 2) {
			return dirty;
		}

		if (dirty.charAt(0) == dirty.charAt(1)) {
			return stringCleanup(dirty.substring(1));
		}

		return dirty.charAt(0) + stringCleanup(dirty.substring(1));
		
	}
	
	/********** MAR 2, 2020 - No "x" in string **********/
	/**
	 * @param a String str
	 * @return str with all "x" removed
	 * 
	 * This method moves through a string and removes all the occurences of the letter 'x' 
	 * using RECURSION
	 * 
	 * Key takeaways: solving base cases, calling upon method within method, working towards
	 * the base case
	 * 
	 */
	public static String noX(String str) {
	
		if (str.length() == 0) {
			return str;
		}

		if (str.charAt(0) == 'x') {
			return noX(str.substring(1));
		}

		else {
			return str.charAt(0) + noX(str.substring(1));
		}
	}
	
	/********** MAR 2, 2020 - Fibonacci numbers **********/
	/**
	 * @param integer "n"
	 * @return the fibonacci number at "n"
	 * 
	 * This method finds the Fibonacci number at positon "n" using RECURSION
	 * 
	 * Key takeaways: solving base cases, calling upon method within method, working towards
	 * the base case
	 * 
	 */
	public static int recursionFibo(int n) {

		if (n < 2) {
			return n;
		}

		return recursionFibo(n - 1) + recursionFibo(n - 2);
	}

	/********** FEB 29, 2020 - Circular Primes **********/
	/**
	 * @param A positive integer above 0
	 * @return the amount of circular primes preceding it and an arraylist of them
	 * @postcondition "a" remains unchanged
	 * 
	 * This method takes an integer, "a", and finds all the circular primes preceeding it.
	 * Once a circular prime is found, the counter is incremented by one and that circular
	 * prime is added to an ArrayList of the other circular primes
	 * 
	 * Key takeaways: separating one algorithm into several different methods makes the code cleaner,
	 * use a temporary variable to hold a value while you make modifications to other variables in its set
	 * ArrayLists are great because they don’t have a defined length so you can keep adding values to them
	 * when you don’t know how many you’ll add, you can set the result of other methods to local variables
	 * simplify “if” statements by using an exclamation mark instead of a double equals to a condition 
	 * like == false, Hi Mr. Miskew, use System.nanoTime() to keep track of how long a method takes and test certain 
	 * changes to see if they increase the method’s execution speed, and within a method invoke other methods to 
	 * abstract away the complexity of those other functions.
	 * 
	 * INTERESTING QUESTION: What is the correlation between the upperbound and the time it
	 * takes to compute the number of circular primes
	 * 
	 */
	public static int circularPrimes(int a) { 
		int num = 0; // number of circular primes in range
		ArrayList<Integer> circles = new ArrayList<Integer>();
		boolean allPrime = true; // if all the rotations are primes
		double start = System.nanoTime();
		
		
		for (int i = 0; i < a; i++) { //loops to the passed limit, ex: 1,000,000
			
			if (isPrime(i)) { //if current number is a prime
				
				allPrime = true;
				int posRots[] = new int[(int) (Math.log10(i) + 1)];
				posRots = rotation(i);
				System.out.println(Arrays.toString(posRots));
				
				for (int r = 0; r < posRots.length; r++) {
					if (!isPrime(posRots[r])) {
						allPrime = false;
					}
				}
				
				if (allPrime) {
					num++;
					circles.add(i);
				}
			}
		}
		double end = System.nanoTime();
		double run = end - start;
		System.out.println(run/1000000000); // 1 billion
		System.out.println(circles);
		
		return num;
	}

	/********** FEB 29, 2020 - Number rotation **********/
	/**
	 * @param integer "b"
	 * @return an integer array
	 * 
	 * When given an integer, "b, this method returns an array of all the
	 * possbile cyclical permutations of this number. Ex, 197 returns 197,
	 * 971, and 719
	 * 
	 * Key takeaway: converting between int and string, using .substring and
	 * .charAt
	 * 
	 */
	public static int[] rotation(int b) {
		
		String num = String.valueOf(b);
		int rotations[] = new int[num.length()];
	
		for (int i = 0; i < num.length(); i++) {
			rotations[i] = Integer.parseInt(num); // converts string to int
			num = num.substring(1) + num.charAt(0);		
		}
	
		return rotations;
	}
	
	/********** FEB 29, 2020 - Is prime? **********/
	/**
	 * @param integer "n"
	 * @return if "n" is a prime or not
	 * 
	 * When given an integer "n", this method returns whether or not "n" is a
	 * prime by dividing it by every number up to its square root
	 * 
	 * Key takeaway: completing base case (0 or 1), invoking Math.sqrt function
	 * 
	 */
	public static boolean isPrime(long current) {
		
		if (current == 0 | current == 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(current); i++) {
			if (current % i == 0) {
				return false;
			}
		}
		return true;
	}  	
	
	/********** FEB 28, 2020 - Insertion Sort **********/
	/**
	 * @param integer array "a"
	 * @return array sorted from smallest to largest
	 * 
	 * Sorts an array of integers using the selection sort method
	 * 
	 * Key takeaway: Coding java based off of pseudocode and diagrams
	 * 
	 */
	public static String insertionSort(int[] a) {
		
		int temp = 0;
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		return Arrays.toString(a);
	}
	
	/********** FEB 15, 2020 - Bogo sort **********/
	/**
	 * @param An unsorted integer array
	 * @return Same integer array sorted
	 * @postc
	 * 
	 * This comically inefficient sorting method randomly shuffles
	 * an int array until it is sorted in ascending order. The initial
	 * array remains unchanged as a copy of said array is made using the
	 * .clone() method. 
	 * 
	 * Key takeaways: Copying arrays with the .clone() method, using the Random()
	 * object to create random numbers in a set range, using a ctr in a while loop,
	 * switching values with String temp variable, using the System.nanoTime() method
	 * to time how long a program takes
	 * 
	 * INTERESTING QUESTION: What is the correlation between length of an array and
	 * what the average attempt count
	 * 
	 */
	public static String bogoSort(int[] a) {

		// int declarations
		int[] b = a.clone();
		System.out.println(Arrays.toString(a));
		boolean sorted = false;
		Random u = new Random();
		double start = System.nanoTime();
		double ctr = 0;
		
		while (sorted == false) {
			for (int i = 0; i < b.length; i++) {
				int index = u.nextInt(b.length);
				int temp = b[index];
				b[index] = b[i];
				b[i] = temp;
			}
			
			ctr++;
			
			if (arraySorted(b) == true) {
				sorted = true;
			}
		}
		
		double end = System.nanoTime();
		double run = end - start;
		System.out.println("Milliseconds: " + run/1000000);
		System.out.println("Attempts: " + ctr/1000000 + " million");
		
		return Arrays.toString(b);
	}
	
	/********** FEB 15, 2020 - Code execution timer **********/
	/**
	 * @return time in milliseconds code takes to execute
	 * 
	 * Uses the System.nanoTime() method 
	 * 
	 * Key takeaways: Basic looping practice
	 * @throws InterruptedException 
	 * 
	 */
	public static void codeTimer() throws InterruptedException {
		
		long startTime = System.nanoTime();
		
		TimeUnit.SECONDS.sleep(3);
		
		long endTime = System.nanoTime();
		
		long runTime = endTime - startTime;
		
		System.out.println("Milliseconds: " + runTime/1000000);
		
	}
	
	/********** FEB 14, 2020 - Array sorted test **********/
	/**
	 * @param Any integer array
	 * @return whether array is sorted or no
	 * 
	 * Compares the current array value to the one ahead and checks to see if the
	 * current one is larger than the one ahead. If so, array is unsorted, else, array
	 * is sorted
	 * 
	 * Key takeaways: Basic looping practice
	 * 
	 */
	public static boolean arraySorted(int[] a) {
		
		//looping through array
		for (int i = 0; i < a.length - 1; i++) {
			// testing to see if two ints are in ascending order
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		
		// "else return true"
		return true;
	}
	
	/********** FEB 12, 2020 - S1 CCC Question **********/
	/**
	 * @param A minimum of two time-displacement data points
	 * @return The maximum velocity of a vector
	 * 
	 * Finds the maximum velocity of a movement given two time values and two
	 * position values
	 * 
	 * Key takeaways: Complex looping and problem solving, time optimization, 
	 * applications of 2D integer arrays. Using scanners in competition setting. 
	 * Using the .isNaN method to avoid not-a-number errors
	 * 
	 */
	
	public static void S1CCC () {
		
		Scanner s = new Scanner(System.in); // creating scanner
		int valTotal = s.nextInt();
			
		if (valTotal < 2) {
			System.out.println();
		}		

		else {
		
		int[][] data = new int[valTotal][2]; // creating array [rows][columns]
		double[] speed = new double[valTotal - 1];
		double time = 0;
		double disp = 0;
		
		Scanner two = new Scanner(System.in); // assigning values
		for (int i = 0; i < valTotal; i++) { 
			data[i][0] = two.nextInt();
			data[i][1] = two.nextInt();			
		}
	
		Arrays.sort(data, (a, b) -> Integer.compare(a[0], b[0])); // sorting based on column a
			 
		for (int j = 0; j < data.length - 1; j++) { // looping through values
			time = data[j + 1][0] - data[j][0];
			disp = data[j + 1][1] - data[j][1];
			speed[j] = (double) disp/time;
		}
		
		for (int h = 0; h < speed.length; h++) { // conversion to positive ints
			if (speed[h] < 0) {
				speed[h] = speed[h] * -1;
			}
		}
		
		Arrays.sort(speed); // sorting it
		double result = speed[valTotal - 2]; //getting result

		
		if (Double.isNaN(result) == true) {
			System.out.println();
		}
		
		else if (Double.isNaN(result) == false) {
			System.out.println(result); // printing result
		}	
		}
	}
	
	/********** FEB 12, 2020 - Selection Sort **********/
	/**
	 * @param integer array "f"
	 * @return array sorted from smallest to largest
	 * 
	 * Sorts an array of integers using the selection sort method
	 * 
	 * Key takeaway: Coding java based off of pseudocode and diagrams
	 * 
	 */
	public static void selectionSort(int[] f) {
		
		double start = System.nanoTime();
		
		int len = f.length;

		for (int i = 0; i < len - 1; i++) {

			int min_idx = i;
			for (int j = i + 1; j < len; j++)
				if (f[j] < f[min_idx])
					min_idx = j;

			int temp = f[min_idx];
			f[min_idx] = f[i];
			f[i] = temp;
		}
		
		double end = System.nanoTime();
		double run = end - start;
		System.out.println("Milliseconds: " + run/1000000);
		System.out.println(Arrays.toString(f));
	}

	/********** FEB 11, 2020 - Bubble sort **********/
	/**
	 * @param integer array "j"
	 * @return array sorted from smallest to largest
	 * 
	 * Sorts an array of integers using the bubble sort method
	 * 
	 * Key takeaway: Coding java based off of pseudocode and diagrams,
	 * exploring different sorting types
	 * 
	 */
	public static void bubbleSort(int[] a) {
		
		for (int h = 0; h < a.length - 1; h++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	/********** FEB 6, 2020 - Linear search **********/
	/**
	 * @param integer array a, integer r
	 * @return position of "r" or -1
	 * 
	 * Searches an array for a certain integer made as a part of comp. sci.
	 * class excersize
	 * 
	 * Key takeaway: Basic looping
	 * 
	 */
	public static int linearSearch(int[] a, int r) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == r) {
				return i;
			}
		}
		
		return -1;
	}
	
	/********** JAN 8, 2020 - Random capitals **********/
	/**
	 * @param
	 * @return
	 * 
	 * Purpose of method
	 * 
	 * Key takeaway: blah blah blah
	 * 
	 */
	public static String randomCaps(String message) {
		
		int rand = 0;
		for (int i = 0; i < message.length(); i++) {
			rand = (int) (Math.random()*2);
			if (rand == 0) {
				
			}
		}
		
//		Random r = new Random();
//		
//		for (int d = 0; d < a; d++) {
//			randNums[d] = r.nextInt(c-b) + b;
//		}
		
		return message;
	}
	
	/********** JAN 8, 2020 - Email verification **********/
	/**
	 * @param
	 * @return
	 * 
	 * Purpose of method
	 * 
	 * Key takeaway: blah blah blah
	 * 
	 */
	public static boolean emailVerification(String email) {
		
		boolean valid = false;
		boolean atSign = false;
		boolean number = false;
		boolean caps = false;
		boolean mark = false;
		
		for (int i = 0; i < email.length(); i++) {
//			if(email.charAt(0) = "@") {
//				
//				
//			}
			
			System.out.println(email.charAt(0));
			
		}

		// semi prime, next prime, is prime, nearest prime
			// two countersm, ctrA, ctrB
		
		
		return valid;
	}
	
	/********** JAN 8, 2020 - Replacing string with "xxx" **********/
	/**
	 * 
	 * @param word
	 * @return newWord
	 * 
	 * Takes a string and returns if > 3
	 */
	public static String replaceWithXXX (String word) {
		
		String newWord = "";
		
		if (word.length() < 3) {
			return word;
		}
		
		if (word.length() > 3) {
			newWord = word.charAt(0) + "xxx" + word.charAt(word.length() - 1);
			return newWord;
		}

		return newWord;
	}
	
	/********** JAN 8, 2020 - Searching for string **********/
	/**
	 * 
	 * @param attendees
	 * @param person
	 * @return position
	 * 
	 * Takes a stack of strings (names) and searches it for a specific name. If
	 * the method finds the position, it returns it. If not, it will return a 
	 * negative 1.
	 * 
	 * Key takeaway: Creating stacks, using flags, looping while full, cloning
	 * an array, using ctr to find position
	 */
	@SuppressWarnings("unchecked")
	public static int searchStack(Stack<String> attendees, String person) {
		
		int ctr = 0;
		String temp = "";
		boolean present = false;
		Stack<String> secondStack = new Stack<String>();
				
		secondStack = (Stack<String>) attendees.clone();
		System.out.println(secondStack);
		
		
		while (!attendees.isEmpty()) {
			temp = attendees.pop();
			if (temp.equalsIgnoreCase(person)) {
				return ctr;
			}
			secondStack.push(temp);
			ctr++;
		}
		return -1;
	}
	
	/********** JAN 6, 2020 - Finding sum of all primes in a queue **********/
	/**
	 * 
	 * @param reportCard
	 * @return sum of all primes
	 * @postCondition: Queue remains unchanged
	 * 
	 * Takes a queue of integers and transfers them into a new queue. During this process
	 * each all the primes from each integer are accumulated and summed, which is what this 
	 * method returns.
	 * 
	 * Key takeaway: Initializing queues, conditional code, implementing the invocation of other
	 * methods.
	 * 
	 */
	public static void sumPrimesInQueue (Queue<Integer> reportCard) {
		
		Queue<Integer> newQueue = new LinkedList<Integer>();
		int sum = 0;
		int temp = 0;
		//int[] temp = {}; Don't know length; won't work

		System.out.println(reportCard);
		
		while (!reportCard.isEmpty()) {
			temp = reportCard.remove();
			
			ArrayList<Integer> primes = findPrimes(temp);
			
			for (int i = 0; i < primes.size(); i++) {
				sum = sum + primes.get(i);
			}
			
			newQueue.add(temp);
		}
			
		reportCard = newQueue;
		System.out.println(sum);
	}
		
	/********** JAN 5, 2020 - Reversing a queue **********/
	/**
	 * @param days
	 * @return reversed queue
	 * 
	 * Takes a queue then uses a stack to reverse the queue
	 * 
	 * Key takeaways: Initializing stacks and queues, using !.isEmpty(),
	 * and popping, pushing, adding, and removing
	 */
	public static void reverseQueue(Queue<String> days) {
		Stack<String> temp =  new Stack<String>();

		while (!days.isEmpty()) {
			temp.push(days.remove());
		}
		
		while (!temp.isEmpty()) {
			days.add(temp.pop());
		}
		
		System.out.println(days);
	}
	
	/********** JAN 5, 2020 - Sorting with a stack **********/
	/**
	 * @param classes
	 * @return HL stack and SL stack
	 * 
	 * Takes a stack containing a set of strings then divides the 
	 * elements into two separate stacks based on the first two
	 * characters. In this instance, the method divides a stack
	 * containing all my classes into two separate stacks that
	 * would contain the HL classes and the SL classes.
	 * 
	 * Key takeaway: More practice initializing stacks, looping through
	 * stacks using !.isEmpty(), and conditional poping and pushing
	 * 
	 */
	public static void stackSort(Stack<String> classes) {
		Stack<String> HL = new Stack<String>();
		Stack<String> SL = new Stack<String>();
		String temp = "";
	
		while (!classes.isEmpty()) {
			temp = classes.pop();
			
			if (temp.substring(0,2).equalsIgnoreCase("hl")) {
				HL.push(temp);
			}
			
			if (temp.substring(0,2).equalsIgnoreCase("sl")) {
				SL.push(temp);
			}
		}
		
		System.out.println("HL classes are:" + HL);
		System.out.println("SL classes are:" + SL);
	}
	
	/********** JAN 5, 2020 - Reversing a stack **********/
	/**
	 * @param words
	 * @return reversed stack
	 * 
	 * Reverses a stack by adding its elements to a queue then pushing it back
	 * to the stack
	 * 
	 * Key takeaway: Initializing stacks and queues, adding, removing, popping, and pushing
	 * elements
	 * 
	 */
	public static void reversingStack (Stack<String> words) {
		/*
		 * For the parameters, stack means that the variable type is a stack
		 * <String> means that the stack is composed of strings
		 * words is the name of the stack
		 */
		
		// NOTE: You can do this with 3 stacks; however, I'll use a queue for efficiency
		
		System.out.println(words);
		Queue<String> tempQueue = new LinkedList<String>();
		
		while (!words.isEmpty()) {
			tempQueue.add(words.pop());
		}
		while (!tempQueue.isEmpty()) {
			words.push(tempQueue.remove());
		}
		
		System.out.println(words);
		
	}
	
	/********** DEC 30, 2019 - Printing a 2D array in column major **********/
	/**
	 * 
	 * @param arr
	 * @return 2D array
	 * 
	 * Prints a 2D array in the column major fashion
	 * 
	 * Key takeaway: complex looping with 2D arrays
	 */
	public static void print2DColumnMajor(int[][] arr) {
		
		if (arr == null) {
			return;
		}
		
		for (int c = 0; c < arr[0].length; c = c + 1) {
			for (int r = 0; c < arr.length; r = r + 1) {
				System.out.println(arr[r][c]);
			}
		}
		
		
	}
	
	/********** DEC 27, 2019 - Converts base 10 to base 2 **********/
	/**
	 * 
	 * @param a
	 * @return base2
	 * 
	 * Takes an integer a in base 10 then converts it into base 2 through a series
	 * of mathematical operations
	 * 
	 * Key takeaway: using Math.pow and Math.rint and complex looping - including while
	 */
	public static String base10to2 (int a) { // a is in base 10

		String base2 = "";
		int tempNum = 0;
		int firstNum = 0;
		int origNum = 0;
		double n = 0;
		
		while (firstNum < a) {
			firstNum = (int) Math.pow(2, n++);
		}
		
		firstNum = firstNum / 2;
		origNum = firstNum;
		base2 = base2 + "1";
		tempNum = a - (firstNum);
		
		System.out.println("here: " + origNum);
		
		for (int i = 1; i < n - 1; i++) { // first num and temp num
			firstNum = (int) Math.rint(Math.pow(origNum, ((n - 2 - i)/(n - 2))));

			if ((int) tempNum / firstNum == 1) {
				tempNum = tempNum - firstNum;
				base2 = base2 + "1";
			}
			
			else if ((int) tempNum / firstNum == 0) {
				base2 = base2 + "0";
			} 
			
			else if (tempNum == 0) {
				base2 = base2 + "0";
			}
		}
		// test
		
		return a + " in base 2 is: " + base2;
	}
	
	/********** DEC 19, 2019 - Finds all the even fibonacci numbers in a range **********/
	/**
	 * 
	 * @param a
	 * @return base2
	 * 
	 * Takes an integer a in base 10 then converts it into base 2 through a series
	 * of mathematical operations
	 * 
	 * Key takeawys: Converting string to int, casting to int, learning about ASCII and use of
	 * 48 as 0, and consolidating knowledge of use of Math.pow method
	 */	
	public static void evenFib (int max) {
	
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		int len = list.size();
		int nTerm = list.get(0) + list.get(1);
		list.add(nTerm);
		
		while (nTerm < max) {
			nTerm = list.get(len - 2) + list.get(len - 1);
			list.add(nTerm);
		}
		
		list.remove(list.size() - 1);
		
		System.out.println(list);
		
		
	}
	
	/********** DEC 18, 2019 - Finding the sum of all multiples of 3 and 5 **********/
	/**
	 * 
	 * @param a
	 * @return sum
	 * 
	 * Takes an int n and finds the sum of all multiples of either 3 or 5 before it
	 * 
	 * Key  Simple for loop practice and dual conditions
	 * 
	 */	
	public static int multiple3and5 (int max) {
		
		int sum = 0;
		
		for (int i = 0; i < max; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}
		return sum;
	}
		
	/********** DEC 14, 2019 - Finds the IQR of an array **********/
	/**
	 * 
	 * @param c[]
	 * @return IQR 
	 * 
	 * Invokes the method findQ3 and findQ1 to find the interquartile range
	 * by subtracting the two
	 * 
	 * Key takeaway: Learning to invoke methods from other sections of the code
	 * 
	 */	
	public static double findIQR (double[] c) {
		double iqr = findQ3(c) - findQ1(c); //referencing the methods findQ3 and findQ1 to find range
		return iqr;
	}
		
	/********** DEC 13, 2019 - Finds the Q1 of an array **********/
	/**
	 * 
	 * @param a[]
	 * @return Q1 
	 * 
	 * Find the first quartile value or lower bound of an array, also known as Q1
	 * 
	 * Key takeaway: Finding the position of a value by multiplying the length by
	 * a specific value (0.25)
	 * 
	 */	
	public static double findQ1 (double[] a) {
		double q1 = 0;
		
		if ((a.length - 1)/2 % 2  == 0) { //check to see if the halves on each side of the median are EVEN
			q1 = (a[(int) ((a.length * 0.25) - 1)] + a[(int) (a.length * 0.25)]) / 2;
		}
		
		else if (((a.length - 1)/2) % 2 == 1) { //check to see if the halves on each side of the median are ODD
			q1 = a[(int) ((a.length * 0.25))];
		}	
		
	return q1;
	}
		
	/********** DEC 13, 2019 - Finds the Q3 of an array **********/
	/**
	 * 
	 * @param a[]
	 * @return Q3 
	 * 
	 * Find the third quartile value or upper bound of an array, also known as Q3
	 * 
	 * Key takeaway: Finding the position of a value by multiplying the length by
	 * a specific value (0.75)
	 * 
	 */	
	public static double findQ3 (double[] a) { 
		double q3 = 0;
		
		if ((a.length - 1)/2 % 2  == 0) { //check to see if the halves on each side of the median are EVEN
			q3 = (a[(int) (a.length * 0.75)] + a[(int) (a.length * 0.75) + 1]) / 2;
		}
		
		else if (((a.length - 1)/2) % 2 == 1) { //check to see if the halves on each side of the median are ODD
			q3 = a[(int) (a.length * 0.75)];
		}
				
		return q3;
	
	}
	
	/********** DEC 12, 2019 - Finds the range of an array **********/
	/**
	 * 
	 * @param a[]
	 * @return range 
	 * 
	 * Invokes the method findMax and findMin to find the range by subtracting the two
	 * 
	 * Key takeaway: Learning to invoke methods from other sections of the code
	 * 
	 */	
	public static int findRange (int[] c) {
		int range = findMax(c) - findMin(c); //referencing the methods findMax and findMin to find range
		return range;
	}
	
	/********** DEC 11, 2019 - Finds the mode of an array **********/
	/**
	 * 
	 * @param a[]
	 * @return mode 
	 * 
	 * Takes a double array and finds the most reoccuring value. If there isn't one, the method
	 * prints to console there is no mode
	 * 
	 * Key takeaway: Complex looping practice
	 * 
	 */	
	public static void findMode (double[] a) {
		int index = 0;
	    int soFar = 1; 
	    int count = 1;
	    double mode = 0;
	    boolean realMode = true;
		
		//Finds the mode
		for (int k = 1; k < a.length; k++){
			if (a[k - 1] == a[k]){
				count++;
			}
			if (count > soFar) { 
				soFar = count ; 
				index = k; 
			} else {
				count = 1;
			}
		}
		
		//Sets mode to the index in data (most repeated number)
		mode = a[index];
		
		//Tests to see if the mode is real
		if (soFar == 1) {
			realMode = false;
			mode = 0;
		}
		System.out.print("The mode in this data set is " + realMode);
		
		if (realMode == true) { //only prints if there's a real mode
			System.out.print(". It is: " + mode);
		}
		System.out.println("");
	}

	/********** DEC 10, 2019 - Finds the median of an array **********/
	/**
	 * 
	 * @param a[]
	 * @return median 
	 * 
	 * Takes a double array and finds the median, or middle value
	 * 
	 * Key takeaway: Even or odd testing and taking the values from specific positions
	 * 
	 */	
	public static double findMedian (double[] a) {
		double median = 0;

		//Finds the median for data sets with an odd length
		if (a.length % 2 == 0) {
			median = (a[(int) ((a.length * 0.5) - 1)] + a[(int) (a.length * 0.5)])/2;
		}
		
		//Finds the median for data sets with an odd length
		if (a.length % 2 == 1) {
			median = a[(int) (a.length * 0.5)];
		}
	return median;
	}

	/********** DEC 9, 2019 - Finds the mean of an array **********/
	/**
	 * 
	 * @param a[]
	 * @return mean 
	 * 
	 * Takes a double array and combines all the values, then divides them by the number to find
	 * the average or "mean"
	 * 
	 * Key takeaway: Use of new method "DoubleStream" and efficient coding and coding practices
	 * 
	 */	
	public static double findMean (double[] a) {
		double mean = (DoubleStream.of(a).sum()) / (a.length); // Double stream finds sum
		return mean;
	}

	/********** DEC 8, 2019 - Finds the max of an array **********/
	/**
	 * This code was created as a part of the analyzing a double array assignment
	 * 
	 * @param a[]
	 * @return min
	 * 
	 * Takes an array of any primitive data type and returns the largest value
	 * 
	 * Key takeaway: basic looping and learning to find values by setting first
	 * value to a value
	 * 
	 */	
	public static int findMax (int[] b) {
		int max = b[0];
		
		for (int h = 0; h < b.length; h++) {
			if (max < b[h]) {
				max = b[h];
			}
		}
		
		/*
		 * One additional solution for this is to sort the array
		 *
		 * Arrays.sort(b);
		 * max = b[b.length - 1];
		*/
		
		return max;
	}

	/********** DEC 8, 2019 - Finds the min of an array **********/
	/**
	 * This code was created as a part of the analyzing a double array assignment
	 * 
	 * @param a[]
	 * @return min
	 * 
	 * Takes an array of any primitive data type and returns the smallest value
	 * 
	 * Key takeaway: basic looping and learning to find values by setting first
	 * value to a value
	 * 
	 */
	public static int findMin (int a[]) {
		int min = a[0];
		
		for (int h = 0; h < a.length; h++) {
			if (min > a[h]) {
				min = a[h];
			}
		}
		
		/*
		 * One additional solution for this is to sort the array
		 *
		 * Arrays.sort(b);
		 * min = b[0];
		*/
		
		return min;
	}

	/********** DEC 4, 2019 - Reading and analysing a .txt file **********/
	/**
	 * 
	 * @param file
	 * @return arr else null
	 * 
	 * Takes a .txt file then scans it then creates an array to output
	 * 
	 * Key takeaway: basic looping and learning to find values by setting first
	 * value to a value
	 * 
	 */
	public static int[] readFiles(String file) {
		/*
		 * A try catch structure is a way to avoid a run time error. 
		 * There are a set of default responses if you have a runTime Error
		 * A try catch is needed in specific cases when methods "throw" an error.
		 * You can check if a method "throws" an exception by checking the documentation
		 */
		try {
			
			File f = new File(file); //Constructs a File Object 
			Scanner s = new Scanner(f); //Constructs a Scanner object using the file object. This "throws" the error
			//If f does not point to a proper file then the code jumps to the catch and doesn't do anything else. 
			//The key thing is that it stops a runTime error. 
			
			
			//Arrays verese ArrayLists:
			//Arrays you must know the size in advance.  This means you have to loop through once
			//to find the size and then construct the array.  Then you run through it again to 
			//populate the array. 
			int ctr = 0;
			
			while (s.hasNextInt()) { 
				ctr++;
				s.nextInt();
			}	
			
			int[] arr = new int[ctr];
			
			Scanner s1 = new Scanner(f);
			
			for (int i = 0; i < arr.length; i++)
				arr[i] = s1.nextInt();
				
			return arr;
		}
		
		catch(Exception e) {
			System.out.println("NO FILE");
			return null;
		}	
			
	}

	/********** DEC 1, 2019 - Converts base 2 to base 10 **********/
	/**
	 * 
	 * @param a
	 * @return resultSum
	 * 
	 * Takes an integer a in base 2 then converts it into base 10 through a series
	 * of mathematical operations
	 * 
	 * Key takeaway: Converting string to int, casting to int, learning about ASCII and use of
	 * 48 as 0, and consolidating knowledge of use of Math.pow method
	 */
	public static int base2to10 (int a) { // a is in base 2
		
		String base2 = String.valueOf(a);
		int resultSum = 0;
		
		for (int i = 0; i < base2.length(); i++) {
			resultSum = (int) (resultSum + ((base2.charAt(i) - 48) * Math.pow(2, (base2.length() - 1) - i)));
		}

		return resultSum;
	}	
	
	/********** DEC 1, 2019 - Sorts an array of strings alphabetically  **********/
	/**
	 * 
	 * @param a
	 * @return
	 * 
	 * Takes an array of strings and rearranges them alphabetically
	 * 
	 * Key takeaway: Simplifing coding by outsourcing code to imported classes, specifically
	 * the .clone(), the Arrays.sort(), and (Arrays.toString())
	 * 
	 */
	public static void alphaSort(String a[]) {
		
		String[] b = a.clone(); // .clone() copies an array to a new array
		Arrays.sort(b); // Arrays.sort sorts data types - for strings; alphabetically
		System.out.println(Arrays.toString(b)); // Arrays.toString() prints out array without loop
			
	}
	
	/********** NOV 29, 2019 - Converts celcius to farenheit  **********/
	/** 
	 * @param a
	 * 
	 * This method takes an int, a, and depending on the condition of the boolean, b, will
	 * convert it to either fareneheit or celcius
	 *
	 * Key takeaway: Conditional code execution, simple arithmetic
	 */
	public static double CeltoFar(int a, boolean b) {
		
		double cel;
		double far;
		
		if (b == true) { 
			far = (a * 1.8) + 32;
			return far;
		}
		
		cel = (a - 32)/1.8;
		return cel;
		
	}

	/********** NOV 29, 2019 - Reverses a string **********/
	/** 
	 * @param String a
	 * 
	 * This method takes an string input a, then outputs the reversed string
	 *
	 * Key takeaway: for loop with string length, use of temp variables and chars. Also,
	 * using a reversed loop (starting at max)
	 */
	public static String stringReverse (String a) {
		
		String rev = "";
		char temp;
		
		for (int i = a.length() - 1; i > -1; i--) {
			temp = a.charAt(i);
			rev = rev + temp;
		}
		return rev;
	}

	/********** NOV 29, 2019 - Finding vowels **********/
	/**
	 * 
	 * @param a
	 * @return true or false
	 * 
	 * Takes a string and finds out if there are vowels present
	 * 
	 * Key takeaway: Using the valuable .indexOf function
	 */
	public static boolean isVowel (String a) {
		if ("aeiou".indexOf(a) != -1) {
			return true;
		}
	return false;	
	}
	/* More inefficient method:
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;		
	}
	*/
	
	/********** NOV 29, 2020 - Finding all primes in a number **********/
	/**
	 * 
	 * @param a
	 */
	public static ArrayList<Integer> findPrimes (int a) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		int i = 0;
		int num = 0;

		for (i = 1; i <= a; i++) {
			int counter = 0;
			
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			
			if (counter == 2) {
				primes.add(i);
			}
		} 
		
		//System.out.println(primes);
		return primes;
	}
	
	/********** NOV 29, 2019 - String splitter **********/
	/**
	 * 
	 * @param a
	 * @returns the first and second parts of the string
	 * 
	 * Takes String a and then splits it into two strings. If the string is even, both
	 * output strings will be of equal length, if the string is odd, the first string will
	 * be the shorter of the two strings
	 * 
	 * Key takeaway: Uses basic string methods, like substring. This is more of an
	 * introductary practice exercize
	 * 
	 * 
	 */
	public static String stringSplitter (String a) {
		
		int length = a.length();
		int middle = length / 2;
		
		String firstHalf = a.substring(0,middle);
		String secondHalf = a.substring(middle, length);
	
		return firstHalf + " + " + secondHalf + " = " + a;
	}

	/********** NOV 28, 2019 - Creating a spiral array **********/
	/**
	 * @param n
	 * @returns arr (spiral)
	 * 
	 * Creates a 2D array that spirals from left to right, top to bottom. It takes
	 * 
	 */	
	public static int[][] spiralArray(int n) {
		
		int[][] arr = new int[n][n]; //creates the square array
		
		int z = 1;
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		
		while (z <= n*n) {
			for (int j = left; j <= right; j = j + 1) {
				arr[top][j] = z;
				z = z + 1;
			}
			top = top + 1; 
	
			for (int j = top; j <= bottom; j = j + 1) {
				arr[j][right] = z;
				z = z + 1;
			}	
			right = right - 1; 
			
			for (int j = right; j >= left; j = j - 1) {
				arr[bottom][j] = z;
				z = z + 1;
			}
			bottom = bottom - 1; 
			
			for (int j = bottom; j >= top; j = j - 1) {
				arr[j][left] = z;
				z = z + 1;
			}
			left = left + 1; 
	}
		return arr;
	}
				
	/********** NOV 21, 2019 - Integer comparison **********/
	/**
	 * @param a
	 * @param b
	 * @return a
	 * 
	 * Returns if the input (b) is less than, equal to, or greater than
	 * the present integer value (a)
	 * 
	 * Key takeaway: Printing responses to a variety of conditions. Also taking input 
	 * from user, and comparing it to preset integer value
	 * 
	 */
	public static void intComparisons(int a, int b) {

			if (b > a) {
				System.out.print("Input is larger than 'a': ");
			}
		
			else if (b < a) {
				System.out.print("Input is smaller than 'a': ");
			} 
			
			else {
				System.out.print("input is equal to 'a': ");
			}
	}
	
	/********** NOV 19, 2019 - Creating a random 2D array **********/
	/**
	 * 
	 * @param rows
	 * @param columns
	 * @param min
	 * @param max
	 * @return arr
	 * 
	 * Takes 2 int values to determine the number of rows and columns in the random
	 * 2D array
	 * 
	 * Key takeaway: Using nested for loops, initializing 2D arrays, and using 
	 * Arrays.deepToString to print out 2D arrays
	 */
	public static String createRandom2DArray(int rows, int columns) {
		
		int[][] arr = new int[rows][columns];

		for (int r = 0; r < arr.length; r = r + 1) {
			for (int c = 0; c < arr[r].length; c = c + 1) {
				arr[r][c] = (int)(Math.random()*100);
			}
		}
		
		return Arrays.deepToString(arr);
	}

	/********** NOV 19, 2019 - Printing a 2D array in row major **********/
	/**
	 * 
	 * @param arr (2d array)
	 * 
	 * Prints a 2D array in the row major method
	 * 
	 * Key takeaway: Working with 2D arrays to store data
	 */
	public static void print2DRowMajor(int[][] arr) {
		if (arr == null) {
			return;
		}
		
		//It prints row major because the rows are on the outside. 
		for (int r = 0; r < arr.length; r = r + 1) {
			for (int c = 0; c < arr[r].length; c = c + 1) {
				System.out.println(arr[r][c]);
			}
		}
	
	}
	
	/********** NOV 18, 2019 - Finding the smallest word **********/
	/**
	 * 
	 * @param "a"
	 * @return string in "a"
	 * 
	 * Takes an array of strings an finds the smallest one
	 * 
	 * Key takeaway: Looping, using .compareToIgnoreCase (new method), comparing
	 * parts of a class 
	 * 
	 */
	public static String findAlphaSmallest(String[] a) {
		String min = a[0];
		
		for (int i = 0; i < a.length; i = i + 1) {
			if (a[i].compareToIgnoreCase(min) < 0) {
				min = a[i];
			}
		}
		
		return min;
	}

	
	/********** NOV 18, 2019 - Creating a random array**********/
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return string arr
	 * 
	 * Takes an int value, a, that determines the amount of numbers, and more int values
	 * b and c which define the range of possible numbers
	 * 
	 * Key takeaway: Using complex for loops and arrays, using Arrays.toString(parameter)
	 * 
	 * 
	 */
	public static String createRandomArray (int a, int b, int c) {
		// a is num of nums, b is min, c is max
		
		int[] randNums = new int[a];
		Random r = new Random();
		
		for (int d = 0; d < a; d++) {
			randNums[d] = r.nextInt(c-b) + b;
		}
		
		return Arrays.toString(randNums);
	}
		
	/********** NOV 17, 2019 - Tests for subsequent integer presence **********/
	/**
	
	 * @param a
	 * @param b
	 * @param c
	 * 
	 * Returns true if there's a certain integer and then another certain integer
	 * after in an array.
	 * 
	 * Key takeaway: Conditional code completion; dependent on one boolean to be true
	 * to continue the algorithm. Also uses flags that allow the conditional code
	 * to work as intended
	 */
	public static boolean has12(int[] a, int b, int c) {
		
		boolean flag = false; // Current state is false until corrected
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				flag = true;
			} 
			
			if (a[i] == c && flag==true) {
				return true;
			}
		}
		return false;
	}

	/********** NOV 16, 2019 - Testing for variable presence in array **********/
	/** 
	
	 * @param a[]
	 * @param b
	 * Given an int array and an int b, this method tests to see if the int b
	 * is present within the int array a
	 *  
	 * Key takeaway: Testing for variable presence with if statements
	 */
	public static boolean inArray(int a[], int b) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return true;
			}
		}
		return false; //this is like "else return false"
	
	}
	
	/********** NOV 16, 2019 - Finding array digit sum for strings **********/
	/** 
	
	 * @param integer array a
	 * 
	 * Given an integer of numbers, "a", this method will find the sum of
	 * all individual ints
	 *  
	 * Key takeaway: Looping through an array, casting between string and int, 
	 * using the .substring method, and using the Integer.parseInt()
	 */
	public static int findArrayDigitSumSTR(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i = i + 1) {
			
			String temp = "" + a[i]; // casting (converts data types)
			String b = temp.substring(0,1);
			
			String c = "0";
			
			if (temp.length() > 1) {
				c = temp.substring(1,2);
			}
			
			sum = sum + Integer.parseInt(b) + Integer.parseInt(c); // .parseInt() - parses a string and returns an integer.
		
		}
		
		return sum;
	}
	
	/********** NOV 15, 2019 - Finding the sum of individual ints **********/
	/** 
	
	 * @param integer array a
	 * 
	 * Given an integer of numbers, "a", this method will find the sum of
	 * all individual ints
	 *  
	 * Key takeaway: Looping through an array, using mod 10 and div 10
	 */	
	public static int findArrayDigitSum(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			int temp = a[i]; 
			int b = temp % 10;
			int c = temp / 10; 
			sum = sum + b + c;
		}
	
		return sum;
	}
	
	/********** NOV 15, 2019 - Comparing 3 integer values **********/
	/** 
	
	 * @param a
	 * @param b
	 * @param c
	 * Given 3 integers, this algorithm returns 20 if all are equal, returns
	 * 10 if two integers are equal and finally 0 if none are equal
	 *  
	 * Key takeaway: Comparing an series of integer values.
	 */
	public static int greenTicket(int a, int b, int c) {
		// if all the numbers are equal
		if (a == b && b == c) {
			return 20;
		}
		
		// if two of the numbers are equal
		if (a == b || b == c || c == a) {
			return 10;
		}	
		return 0;
	}

	/********** NOV 2, 2019 - Calculating range of a projectile **********/
	/** 
	
	 * @param a
	 * @param b
	 * 
	 * Takes a value for initial velocity, a, and the angle at which it is fired and uses
	 * the range formula to find the displacement neglecting air resistance 
	 *  
	 *  Key takeaway: Performing complex artimetics and working with differernt primitave variable types
	 */
	public static double findingRange(double a, double b ) {  // a is vel, b is angle
		
		double range = 0;
		double radians = 0; 
		// in Java all angles are in radians, not degrees. I will use this variable to convert 
		// the b value which is in degrees to radians
		// 1 degree × π/180 = radians
		
		radians = b * Math.PI/180;
	
		// Based on my physics textbook, this is the formula: V₀² * sin(2 * α) / g
		
		range = (Math.pow(a, 2) * Math.sin(2 * radians)) / 9.81;
		return range;
	}
	
	/********** NOV 1, 2019 - Creating an endlessly looping method **********/
	/** 
	 * 
	 * Repeats the contents of a while loop until the user stops the method
	 *  
	 * Key takeaway: The "takeaway" is creating a method that will repeat forever based
	 * on a condition that will always be true
	 */
	public static void uselessMethod () {
		while (1 < 2) {
			System.out.println("1");
		}
	}

}