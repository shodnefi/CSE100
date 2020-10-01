//AUTHOR: Scott Hodnefield
// FILENAME: Lab3.java
// SPECIFICATION:
// FOR: CSE 110 - Lab #3
// TIME SPENT: 3 hrs 

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int homework = 0;
		int examMidterm = 0;
		int examFinal = 0;
		double weightedTotal = 0; 
		int i = 0;
		
		while (i < 3) {
			if (i == 0) {
				System.out.print("Enter your HOMEWORK grade: ");
				homework = scan.nextInt();
				if(homework >= 0 && homework <= 100) {
					i++;
				}
				else {
					System.out.println("Invalid input. HOMEWORK grade is between 0 and 100.");
					}
				}
			
			if (i == 1) {
				System.out.print("Enter your MIDTERM grade: ");
				examMidterm = scan.nextInt();
				if (examMidterm >= 0 && examMidterm <= 100) {
					i++;
				}
				else {
					System.out.println("Invalid input. MIDTERM grade is between 0 and 100.");
				}
			}
			if (i == 2) {
				System.out.print("Enter your FINAL EXAM grade: ");
				examFinal = scan.nextInt();
				if (examFinal >= 0 && examFinal <= 200) {
					i++;
				}
				else {
					System.out.println("Invalid input. FINAL EXAM grade is between 0 and 200");
				}
				}
			}	
			
			weightedTotal = ((double) examFinal / (200/50) + ((double) examMidterm * 0.25) + ((double) homework * 0.25));
			
			System.out.printf("[INFO] Student's weighted total is: " + "%.2f%n", weightedTotal);
			if (weightedTotal >= 50) {
				System.out.print("[INFO] Student PASSED the class");
			}
			else {
				System.out.print("[INFO] Student Failed the class");
			} 
			scan.close();
		}
	}
