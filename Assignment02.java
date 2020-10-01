//CSE 110: Class #: 76375 iCourse 
//Assignment: Assignment 02
//Author: Scott Hodnefield 1205811226
//Description: Takes user inputs to determine cost and materials need for road projects 

import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double miles = 0; //length of road project in miles
		int lanes = 0; //number of lanes 
		int depth = 0; //depth of asphalt in inches
		int days = 0; //days to complete project 
		
		System.out.print("Length of road project (miles) : ");
		miles = scan.nextDouble();
		System.out.print("Number of lanes                : ");
		lanes = scan.nextInt();
		System.out.print("Depth of asphalt (inches)      : ");
		depth = scan.nextInt();
		System.out.print("Days to complete project       : ");
		days = scan.nextInt();
		
		scan.close();
		
		final int TRUCK_WEIGHT = 10000; //load in lbs
		final int LANE_WIDTH = 12; //in feet 
		final double WEIGHT = 150; //asphalt lbs/ft^3 
		final int COST_TON = 200; // cost per ton asphalt 
		final int PIPE_COST = 500; //cost per 24ft
		final int PIPE_LENGTH = 24; //conduit pipe length 
		final int STOPLIGHT_COST = 25000; //cost per 
		final int WAGE = 25; //dollar per hour 
		final int FT_PER_MILE = 5280;
		final int TRUCK_TONS = 5; 
		final int HOURS_PER_DAY = 8; 
		
		double asphaltNeeded = miles * FT_PER_MILE * lanes * LANE_WIDTH * ((double) depth / 12);
		double truckCap =  (double) TRUCK_WEIGHT / WEIGHT; //in cubic feet
		double truckLoads = Math.ceil((double) asphaltNeeded / truckCap); // total number needed 
		int stoplights = (2 + lanes) * (int) miles; 
		int pipe = (int) (miles * FT_PER_MILE) / PIPE_LENGTH; 
		double crewMember = Math.ceil((50 * miles * lanes) / (double) days); 
		double asphaltCost = TRUCK_TONS * COST_TON * truckLoads;
		double costStopLight = stoplights * STOPLIGHT_COST;
		double costConduit = pipe * PIPE_COST; 
		double costLabor = crewMember * WAGE * days * HOURS_PER_DAY; 
		double totalCost = asphaltCost + costStopLight + costConduit + costLabor; 
		
		System.out.println("=== Amount of materials needed ===");
		System.out.println("Truckloads of asphalt : " + Math.round(truckLoads));
		System.out.println("Stoplights            : " + stoplights);
		System.out.println("Conduit pipes         : " + pipe);
		System.out.println("Crew members needed   : " + Math.round(crewMember));
		System.out.println("=== Cost of Materials ============");
		System.out.printf("Cost of asphalt       : $" + "%.2f%n", asphaltCost);
		System.out.printf("cost of stoplights    : $" + "%.2f%n", costStopLight);
		System.out.printf("Cost of conduit       : $" + "%.2f%n", costConduit);
		System.out.printf("Cost of labor         : $" + "%.2f%n", costLabor);
		System.out.println("=== Total Cost of Project ========");
		System.out.printf("Total cost of project : $" + "%.2f%n", totalCost); 	
	}
}
