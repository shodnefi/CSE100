//AUTHOR: Scott Hodnefield
// FILENAME: Lab2.java
// SPECIFICATION: Takes user name and returns it in full caps and provides length & syntax exercise for "==" and ".equals()"
// FOR: CSE 110 - Lab #2
// TIME SPENT: 45min 


import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter first name: "); //user input for first name 
		String firstName = scan.nextLine();
		System.out.print("Please enter last name: "); //user input for last name 
		String lastName = scan.nextLine();
		String fullName = firstName + " " + lastName; // cat into readable full name 
		int nameLength = fullName.length(); //find full name length including space between 
		
		scan.close();
		
		System.out.println("Full name (IN CAPITALS): " + fullName.toUpperCase()); //print full name and convert to caps 
		System.out.println("Length of full name: " + nameLength); //print length 
		
		
		String title1 = new String("cse110");
		String title2 = "cse110";
		
		
		//if else statements to show if two strings can be compared with "==" and ".equals()" methods
		if (title1 == title2) {
			System.out.println("String comparison using \"==\" sign works");
		}	else {
				System.out.println("String comparison using \"==\" sign does NOT work");
		}
		
		if (title1.equals(title2)) {
			System.out.println("String comparison using \"equals\" method works");
		}	else {
				System.out.println("String comparison using \"equals\" method does NOT work");
		}
		
}
}
