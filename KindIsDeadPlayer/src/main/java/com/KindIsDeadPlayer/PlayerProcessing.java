package com.KindIsDeadPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//import Utility;


public class PlayerProcessing {

	/**
	 * Populate the map randomly. Purpose: Populate each country with 4 tokens
	 * which includes homeland with 4 tokens of their color. Intialited by:
	 * Server Data : Country and their followers Message: 02: <Country>, <Blue
	 * followers>, <Red followers> , < Yellow followers> E.g.
	 * 02:ES,2,2,0;DE,1,1,2;...
	 * 
	 * @param messageNumber
	 * @param messageDetailsList
	 */
	public static void populateMapRandomly(String messageNumber, List<String> messageDetailsList) {
		
		HashMap<String, HashMap<String, Integer>> locationFollower = new HashMap<>();
		
		System.out.println("\nCountry		Blue	Red		Yellow");
		System.out.println(messageDetailsList.get(0) + "		" + messageDetailsList.get(1) + "	"
				+ messageDetailsList.get(2) + "		" + messageDetailsList.get(3) + "");
		
		locationFollower.put(messageDetailsList.get(0), 
				addFollower(messageDetailsList.get(1), messageDetailsList.get(2), messageDetailsList.get(3)));
		
		System.out.println(messageDetailsList.get(4) + "		" + messageDetailsList.get(5) + "	"
				+ messageDetailsList.get(6) + "		" + messageDetailsList.get(7) + "");
		
		locationFollower.put(messageDetailsList.get(4), 
				addFollower(messageDetailsList.get(5), messageDetailsList.get(6), messageDetailsList.get(7)));
		
		System.out.println(messageDetailsList.get(8) + "		" + messageDetailsList.get(9) + "	"
				+ messageDetailsList.get(10) + "		" + messageDetailsList.get(11) + "");
		
		locationFollower.put(messageDetailsList.get(8), 
				addFollower(messageDetailsList.get(9), messageDetailsList.get(10), messageDetailsList.get(11)));
		
		System.out.println(messageDetailsList.get(12) + "		" + messageDetailsList.get(13) + "	"
				+ messageDetailsList.get(14) + "		" + messageDetailsList.get(15) + "");
		locationFollower.put(messageDetailsList.get(12), 
				addFollower(messageDetailsList.get(13), messageDetailsList.get(14), messageDetailsList.get(15)));
		
		System.out.println(messageDetailsList.get(16) + "		" + messageDetailsList.get(17) + "	"
				+ messageDetailsList.get(18) + "		" + messageDetailsList.get(19) + "");
		locationFollower.put(messageDetailsList.get(16), 
				addFollower(messageDetailsList.get(17), messageDetailsList.get(18), messageDetailsList.get(19)));
		
		System.out.println(messageDetailsList.get(20) + "		" + messageDetailsList.get(21) + "	"
				+ messageDetailsList.get(22) + "		" + messageDetailsList.get(23) + "");
		locationFollower.put(messageDetailsList.get(20), 
				addFollower(messageDetailsList.get(21), messageDetailsList.get(22), messageDetailsList.get(23)));
		
		System.out.println(messageDetailsList.get(24) + "		" + messageDetailsList.get(25) + "	"
				+ messageDetailsList.get(26) + "		" + messageDetailsList.get(27) + "");
		
		locationFollower.put(messageDetailsList.get(24), 
				addFollower(messageDetailsList.get(25), messageDetailsList.get(26), messageDetailsList.get(27)));
		
		System.out.println(messageDetailsList.get(28) + "		" + messageDetailsList.get(29) + "	"
				+ messageDetailsList.get(30) + "		" + messageDetailsList.get(31) + "");
		
		locationFollower.put(messageDetailsList.get(28), 
				addFollower(messageDetailsList.get(29), messageDetailsList.get(30), messageDetailsList.get(31)));
		System.out.println("\n");
		
		
		
		GameParameter.getInstance().setLocationFollower(locationFollower );
	}

	private static HashMap<String, Integer> addFollower(String blueFoll, String redFoll, String yelloFoll) {
		// TODO Auto-generated method stub\
		HashMap<String, Integer> follower = new HashMap<>();
		follower.put("B", Integer.valueOf(blueFoll));
		follower.put("R", Integer.valueOf(redFoll));
		follower.put("Y", Integer.valueOf(yelloFoll));
		return follower;
		
	}

	/**
	 * Distribute two random followers to the players Purpose: Give each player
	 * 2 random followers for their starting court Initiated by: Server Data:
	 * Followers Message: 03: <Player Number>, < Blue Follower > < Red Follower
	 * > <Yellow Followers> Eg: 03:P1,1,0,1
	 * 
	 * @param messageNumber
	 * @param messageDetailsList
	 */
	public static void distributeRandomFollowers(String messageNumber, List<String> messageDetailsList) {
		
		
		System.out.println("Player " + messageDetailsList.get(0) + " has " + messageDetailsList.get(1) + " Blue "
				+ messageDetailsList.get(2) + " Red " + messageDetailsList.get(3) + " Yellow Followers ");
		

	}

	/**
	 * Randomly number your 8 regions (for power struggle resolution order)
	 * Purpose: Assign the country randomly for each number Initiated by: Server
	 * Data: Country Cards Message: 04: < Country 1 > , <Country 2 >, <Country 3 > <Country 8> Eg: 04: MO,NO...ES
	 * 
	 * @param messageNumber
	 * @param messageDetailsList
	 */
	public static void randomlyNameRegion(String messageNumber, List<String> messageDetailsList) {
		
		ArrayList<String> Initializeloca = new ArrayList<String>();
		
		System.out.println("\n");
		System.out.println("Country  	Number");
		System.out.println(messageDetailsList.get(0) + "  		" + 1);
		Initializeloca.add(messageDetailsList.get(0));
		
		System.out.println(messageDetailsList.get(1) + "  		" + 2);
		Initializeloca.add(messageDetailsList.get(1));
		
		System.out.println(messageDetailsList.get(2) + "  		" + 3);
		Initializeloca.add(messageDetailsList.get(2));
		
		System.out.println(messageDetailsList.get(3) + "  		" + 4);
		Initializeloca.add(messageDetailsList.get(3));
		
		System.out.println(messageDetailsList.get(4) + "  		" + 5);
		Initializeloca.add(messageDetailsList.get(4));
		
		System.out.println(messageDetailsList.get(5) + " 	 	" + 6);
		Initializeloca.add(messageDetailsList.get(5));
		
		System.out.println(messageDetailsList.get(6) + " 	 	" + 7);
		Initializeloca.add(messageDetailsList.get(6));
		
		System.out.println(messageDetailsList.get(7) + " 	 	" + 8);
		Initializeloca.add(messageDetailsList.get(7));
		
		
		GameParameter.getInstance().setInitializeloca(Initializeloca);

	}

	public static void playerTurn(String messageNumber, List<String> messageDetailsList) {

		System.out.println("\n***Player " + messageDetailsList.get(0) + " is selected***\n");
		if (Utility.getInstance().GetPlayerName().equals(messageDetailsList.get(0))) {

			System.out.println("Which card you wish to play ? \n");
			System.out.println("Choose one card from below: \n");
			System.out.println("Supporter card      :---------------- 1 ");
			System.out.println("Assemble card       :---------------- 2 ");
			System.out.println("Manoeuvre card      :---------------- 3 ");
			System.out.println("OutManoeuvre card   :---------------- 4 ");
			System.out.println("Neigotiate card     :---------------- 5 ");
			System.out.println("PASS                :---------------- 6");

			String cardNum = System.console().readLine();
			System.out.println("\n");
			if ("1".equals(cardNum))
				supporterCard();
			else if ("2".equals(cardNum))
				assembleCard();
			else if ("3".equals(cardNum))
				manoeuvre();
			else if ("4".equals(cardNum))
				outManoeuvre();
			else if ("5".equals(cardNum))
				negotiate();
			else if ("6".equals(cardNum))
				passTheTurn();
		}

	}

	
	private static void supporterCard() {
		System.out.println("Choose Scotish(S) Welish(W) English(E) Support Card");
		StringBuilder message = new StringBuilder("07").append(":");

		
		String choice = System.console().readLine();
		
		if(PlayerInfoValidation.getInstance().validateSupporter(choice))
			message.append(choice).append(",");
		else {
			System.out.println("\n ====== Invalid Supporter! Create question again ====== \n");
			supporterCard();
			return;
		}
		
		printRegion();
		
		
		String region = System.console().readLine();
		while(!PlayerInfoValidation.getInstance().validateLocation(region)) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			region = System.console().readLine();
			
		}
		message.append(region);
		
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message.toString());
		drawTheSupportor();
	}

	private static void printRegion() {
		
		// TODO Auto-generated method stub
		System.out.println("\nEnter Region:   \n\n" 
				 + "Moray       :---------------- MO " 
				 + displayFoll("MO")
				 + "Strathclyde :---------------- ST "
				 + displayFoll("ST")
				 + "Lancaster   :---------------- LA " 
				 + displayFoll("LA")
				 + "Northumbria :---------------- NO " 
				 + displayFoll("NO")
				 + "Warwick     :---------------- WA " 
				 + displayFoll("WA")
				 + "Gwynedd     :---------------- GW " 
				 + displayFoll("GW")
				 + "Essex       :---------------- ES "
				 + displayFoll("ES")
				 + "Devon       :---------------- DE " 
				 + displayFoll("DE") );
		
		
	}

	private static String displayFoll(String region) {
		// TODO Auto-generated method stub
		
		StringBuilder message =  new StringBuilder();
		message.append(" Blue Follower - " +GameParameter.getInstance().getLocationFollower().get(region).get("B")
				 +  " Red  Follower - " +GameParameter.getInstance().getLocationFollower().get(region).get("R")
				 +  " Yellow Follower - " +GameParameter.getInstance().getLocationFollower().get(region).get("Y")
				 + "\n" );
		return message.toString();
		
	}

	private static void assembleCard() {

		StringBuilder message = new StringBuilder("08").append(":");
		
		System.out.println("Enter First Region");
		
		printRegion();
		
		message.append(regionFollower());
		
		message.append(",");
		
		System.out.println("Enter Second Region");
		
		printRegion();
		
		message.append(regionFollower());
		
		message.append(",");
		
		System.out.println("Enter Third Region");
		
		printRegion();
		
		message.append(regionFollower());
		
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message.toString());
		
		drawTheSupportor();
	}

	
	private static StringBuilder regionFollower() {
		
		
		// TODO Auto-generated method stub
		StringBuilder message = new StringBuilder();
		String region = System.console().readLine();
		while(!PlayerInfoValidation.getInstance().validateLocation(region)) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			region = System.console().readLine();
			
		}
		message.append(region).append(",");
		
		System.out.println("\nEnter the follower first color to add: [R/B/Y]");
		String color = System.console().readLine();
		
		while(!PlayerInfoValidation.getInstance().validateFollower(color)) {
			System.out.println("\n ====== Invalid Colour Selected! select again ====== \n");
			printRegion();
			color = System.console().readLine();
			
		}
		
		message.append(color);
		return message;
		
	}

	private static void manoeuvre() {
		
		StringBuilder message = new StringBuilder("09:");
		System.out.println("\nEnter the Region seperated by space with follower to swap e");
		printRegion();
		
		String part1 = System.console().readLine();
		String[] data1 = part1.split(" ");
		while(!PlayerInfoValidation.getInstance().validateLocation(data1[0]) || !PlayerInfoValidation.getInstance().validateFollower(data1[1])) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			part1 = System.console().readLine();
			data1 = part1.split(" ");
			
		}
		message.append(data1[0]).append(",").append(data1[1]).append(",");
		

		System.out.println("\nEnter the Region seperated by space with follower to swap");
		printRegion();
		String part2 = System.console().readLine();
		String[] data2 = part2.split(" ");
		while(!PlayerInfoValidation.getInstance().validateLocation(data2[0]) || !PlayerInfoValidation.getInstance().validateFollower(data2[1])) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			part2 = System.console().readLine();
			data2 = part1.split(" ");
			
		}
		message.append(data2[0]).append(",").append(data2[1]);
		
		
		
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message.toString());
		drawTheSupportor();
	}

	private static void outManoeuvre() {
		
		StringBuilder message = new StringBuilder("10:");
		System.out.println("\nEnter the Region1 seperated by space with Two Follower\n "
				+ "Example (MO B Y) to swap");
		printRegion();
		
		String part1 = System.console().readLine(); 
		
		String[] data1 = part1.split(" ");
		while(!PlayerInfoValidation.getInstance().validateLocation(data1[0]) || !PlayerInfoValidation.getInstance().validateFollower(data1[1]) || !PlayerInfoValidation.getInstance().validateFollower(data1[2])) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			part1 = System.console().readLine();
			data1 = part1.split(" ");
			
		}
		message.append(data1[0]).append(",").append(data1[1]).append(",").append(data1[2]).append(",");
		
		
		System.out.println("\nEnter the Region2 seperated by space with follower to swap");
		String part2 = System.console().readLine();
		String[] data2 = part2.split(" ");
		while(!PlayerInfoValidation.getInstance().validateLocation(data2[0]) || !PlayerInfoValidation.getInstance().validateFollower(data2[1])) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			part2 = System.console().readLine();
			data2 = part1.split(" ");
			
		}
		message.append(data2[0]).append(",").append(data2[1]);
		
		
		
		
		
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message.toString());
		drawTheSupportor();
	}
	
	private static void negotiate() {
		
		StringBuilder message = new StringBuilder("11:");
		
		System.out.println("\n Negotiate: Enter country to swap from ");
		System.out.println(GameParameter.getInstance().getInitializeloca());
		String country1 = System.console().readLine();
		
		System.out.println("\nEnter country to swap with");
		while(!PlayerInfoValidation.getInstance().validateLocation(country1)) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			country1 = System.console().readLine();
			
		}
		message.append(country1).append(",");
		
		String country2 = System.console().readLine();
		
		System.out.println("\nEnter country to swap with");
		while(!PlayerInfoValidation.getInstance().validateLocation(country2)) {
			System.out.println("\n ====== Invalid Region Selected! select again ====== \n");
			printRegion();
			country2 = System.console().readLine();
			
		}
		message.append(country2);
		
		
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message.toString());
		drawTheSupportor();
	}
	
	private static void passTheTurn() {
		System.out.println("\n Trun passed to other player. ");
		String message = "15:Pass";
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}
	
	private static void drawTheSupportor(){
		
		System.out.println("\n**Since you have played an action, draw a follower from any country to your court**");
		System.out.println("Please Enter the country name :");
		StringBuilder message = new StringBuilder("12").append(":");
		message.append(regionFollower());
		
		System.out.println("\n");
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message.toString());
	}

	public static void winnerplayer(String messageNumber, List<String> messageDetailsList) {
		
		System.out.println("\n Player "+ messageDetailsList.get(0) + " is Winner !! ");
		System.out.println("\nWinner type is "+messageDetailsList.get(1));
		
	}

	public static void allInfo(String messageNumber, List<String> messageDetailsList) {
		// TODO Auto-generated method stub
		System.out.println("******Round Summary******");
		System.out.println("\nIt was " + messageDetailsList.get(0) + " Turn");
		if(messageDetailsList.get(1).equals("A")) {
			System.out.println("Assemble Card was played");
			System.out.println(messageDetailsList.get(3) + " was added to " + messageDetailsList.get(2));
			System.out.println(messageDetailsList.get(5) + " was added to " + messageDetailsList.get(4));
			System.out.println(messageDetailsList.get(7) + " was added to " + messageDetailsList.get(6));
			
			System.out.println(messageDetailsList.get(9) + " was drawn from " + messageDetailsList.get(8));
			
			
			
		}
		if(messageDetailsList.get(1).equals("S")) {
			System.out.println("Supporter Card was played");
			System.out.println("Two supporter were added to " + messageDetailsList.get(2) + " Region of Country " + messageDetailsList.get(3));
			
			
		}
		if(messageDetailsList.get(1).equals("M")) {
			System.out.println("Manoeuvre Card was played");
			System.out.println(messageDetailsList.get(3) + " was added to " + messageDetailsList.get(2));
			System.out.println(messageDetailsList.get(5) + " was added to " + messageDetailsList.get(4));
			
			
		}
		if(messageDetailsList.get(1).equals("0")) {
			System.out.println("OutManoeuvre Card was played");
			System.out.println(messageDetailsList.get(3) + " and "+ messageDetailsList.get(4) + " was added to " + messageDetailsList.get(2));
			System.out.println(messageDetailsList.get(6) + " was added to " + messageDetailsList.get(5));
			
			
			
		}
		if(messageDetailsList.get(1).equals("N")) {
			System.out.println("Negotiate Card was played");
			System.out.println("Country " + messageDetailsList.get(2) + " is now swapped with " + messageDetailsList.get(3));
			
			
		
		}
		System.out.println("\n");
		
	}

	public static void powerStruggle(String messageNumber, List<String> messageDetailsList) {
		// TODO Auto-generated method stub
		
		System.out.println("\n<<<<<<<<<<<Power Struggle was Processed>>>>>>>>>>");
		System.out.println("Result of Power Struggle : ");
		System.out.println(messageDetailsList.get(0) + " has been taken over by " + messageDetailsList.get(1)+"\n");
		int index = GameParameter.getInstance().getInitializeloca().indexOf(messageDetailsList.get(0));
		GameParameter.getInstance().getInitializeloca().remove(index);
		
	}
	
}
