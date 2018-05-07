/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: 
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */

package edu.sbcc.cs105;

public class SumFun {
	public static void main(String args[]) {
		System.out.println("a. Sum of even = " + computeEvenSum());
		System.out.println("b. Sum of squares = " + computeSquaresSum());
		System.out.println("c. Sum of odd numbers " + args[0] + " to " + args[1] + " = " + computeOddSum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		System.out.println("d. Sum of odd digits in " + args[2] + " = " + computeOddDigitSum(Integer.parseInt(args[2])));
	}
	
	public static int computeEvenSum() {//a
		/**sum of even numbers from*/ int start = 2; /** to */ int end = 100;
		
		int sum = 0;
		for(int i = start; i <= end; i+=2) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	public static int computeSquaresSum() {
		/**sum of the squares of all numbers from*/ int start = 1; /** to */ int end = 100;
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum = (int) Math.round(sum + Math.pow(i, 2));
		}
		
		return sum;
	}
	
	public static int computeOddSum(int a, int b) {
		/**sum of the odd numbers from */ int start = Math.min(a, b); /** to */ int end = Math.max(a, b);
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			if(i%2 == 1)sum = sum + i;
		}
		
		return sum;
	}
	
	public static int computeOddDigitSum(int inputNumber) {
		//sum of all the odd digits of input value
		int sum = 0;
		
		String digits = String.format("%d", inputNumber);
		for(int i = 0; i < digits.length(); i++) {
			int digiti = Integer.parseInt(digits.substring(i, i+1));
			if(digiti%2 == 1) sum = sum + digiti;
		}
		
		return sum;
	}
}
