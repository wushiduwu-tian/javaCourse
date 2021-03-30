//CSE 110    : 15817
//Assignment : 2
//Author     : Scott Hodnefield
//Descriptor : Calculate materials, manpower, and cost of building roads 

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		Scanner bananaPhone = new Scanner(System.in);
		
		double lengthRoad = 0;
		int numberLanes = 0, depth = 0, daysToComp = 0;		
		
		System.out.print("Length of road project (miles) : ");
		lengthRoad = bananaPhone.nextDouble();				
		System.out.print("Number of lanes                : ");
		numberLanes = bananaPhone.nextInt();
		System.out.print("Depth of asphalt (inches)      : ");
		depth = bananaPhone.nextInt();
		System.out.print("Days to complete project       : ");
		daysToComp = bananaPhone.nextInt();
		
		final int LANE_WIDTH = 12; //in feet
		final int ASPHALT_WEIGHT = 160; //lbs per cubic foot
		final int ASPHALT_COST = 230; //dollars per ton
		final int STOPLIGHT_COST = 27000;//per light 
		final int FEET_PER_MILE = 5280;
		final int TRUCK_CAPACITY = 10000; //lbs
		final int COST_CONDUIT = 600; //per 20ft 
		double crewMember = Math.ceil((50 * lengthRoad * numberLanes) / daysToComp);
		int laborCost = (int) (Math.ceil(crewMember) *  8 * daysToComp *  28); //8 hour work day at $28/hr
		double asphaltNeeded = (lengthRoad * FEET_PER_MILE) * ((double) depth / 12) * (numberLanes * LANE_WIDTH); //in cubic feet 
		double truckLoadsNeeded = Math.ceil(asphaltNeeded * ASPHALT_WEIGHT / TRUCK_CAPACITY); 
		int stoplightsNeeded = (2 + numberLanes) * (int) lengthRoad; 
		double numConduitPipes = Math.ceil((lengthRoad * FEET_PER_MILE) / 20); //20 is length of pipe
		double costAsphalt = Math.ceil(truckLoadsNeeded * 5 * ASPHALT_COST); //5 tons per truck
		double costStoplights = stoplightsNeeded * STOPLIGHT_COST; 
		double costConduit = numConduitPipes * COST_CONDUIT; 
		double totalCost = costAsphalt + costStoplights + costConduit + laborCost; 
		
		System.out.println("=== Amount of materials needed ===");
		System.out.println("Truckloads of Asphalt : " + (int)truckLoadsNeeded);
		System.out.println("Stoplights            : " + stoplightsNeeded);
		System.out.println("Conduit pipes         : " + (int)numConduitPipes);
		System.out.println("Crew members needed   : " + (int)crewMember);
		System.out.println("=== Cost of Materials ============");
		System.out.printf("Cost of Asphalt       : $%.2f%n", + (double)costAsphalt);
		System.out.printf("Cost of Stoplights    : $%.2f%n", + (double)costStoplights);
		System.out.printf("Cost of Conduit pipes : $%.2f%n", + (double)costConduit);
		System.out.printf("Cost of Labor         : $%.2f%n", + (double)laborCost);
		System.out.println("=== Total Cost of Project ========");
		System.out.printf("Total cost of project : $%.2f", + totalCost);
		
		bananaPhone.close(); 
	}

}
