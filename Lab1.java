/*------------------------------------------------------------
// AUTHOR: Scott Hodnefield
// FILENAME: Lab1
// SPECIFICATION: Test score average calculator 
// FOR: CSE 110-Lab #1
// TIME SPENT: HOW LONG IT TOOK YOU TO FINISH THIS LAB 
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); //initiate scan for user input 
		
		System.out.print("Please enter your first test score: "); //prompt for first score
		int test1 = (int) scan.nextDouble();
		System.out.print("Please enter your second test score: "); //prompt for second score 
		int test2 = (int) scan.nextDouble();
		System.out.print("Please enter your third test score: "); //prompt for thirs score 
		int test3 = (int) scan.nextDouble();
		
		int total = test1 + test2 + test3; //total value of all test scores 
		final int NUMBER_TESTS = 3; //number of tests as a constant value 
		double average = total / NUMBER_TESTS; //average score 
		
		System.out.print("Your average test score is: " + average); //average score as a complete sentence for user to read 
	}
}