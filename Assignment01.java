//CSE 110: Class #: 76375 iCourse 
//Assignment: Assignment 1
//Author: Scott Hodnefield 1205811226
//Description: Pizza Party - This program allocates slices of pizza to adults and children depending on  how many pizzas were purchased. 
//Partial credit can be awarded


import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
	
		System.out.print("Number of pizzas purchased: ");
		int pizzas = (int) scan.nextInt();
	
		System.out.print("Number of slices per pizza: ");
		int slicesPerPizza = (int) scan.nextInt();
	
		System.out.print("Number of adults:           ");
		int adults = (int) scan.nextInt();
	
		System.out.print("Number of children:         ");
		int children = (int) scan.nextInt();
	
		scan.close(); 
		
		int totalSlices = pizzas * slicesPerPizza; //total number of slices 
		final int SLICES_ADULT = 2; //two slices per adult 
		int totalAdultSlices = SLICES_ADULT * adults; //total number of slices allocated to the adults 
		int forChildren = totalSlices - totalAdultSlices; //remaining slices left to be divided among the children 
		int perChild = forChildren / children; //how many slices per child 
		int leftOvers = forChildren % children; //leftover slices of pizza not allocated 
		
		System.out.println("Total number of slices of pizza:               " + totalSlices);
		System.out.println("Total number of slices given to adults:        " + totalAdultSlices);
		System.out.println("Total number of slices available for children: " + forChildren);
		System.out.println("Number of slices each child will get:          " + perChild);
		System.out.println("Number of slices left over:                    " + leftOvers);
}
}