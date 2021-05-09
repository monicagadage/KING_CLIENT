package com.KindIsDeadPlayer;

import java.util.List;
//import Utility;

import javax.swing.plaf.synth.SynthSpinnerUI;

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
		System.out.println("Country		Blue	Red		Yellow");
		System.out.println(messageDetailsList.get(0) + "		" + messageDetailsList.get(1) + "	"
				+ messageDetailsList.get(2) + "		" + messageDetailsList.get(3) + "");
		System.out.println(messageDetailsList.get(4) + "		" + messageDetailsList.get(5) + "	"
				+ messageDetailsList.get(6) + "		" + messageDetailsList.get(7) + "");
		System.out.println(messageDetailsList.get(8) + "		" + messageDetailsList.get(9) + "	"
				+ messageDetailsList.get(10) + "		" + messageDetailsList.get(11) + "");
		System.out.println(messageDetailsList.get(12) + "		" + messageDetailsList.get(13) + "	"
				+ messageDetailsList.get(14) + "		" + messageDetailsList.get(15) + "");
		System.out.println(messageDetailsList.get(16) + "		" + messageDetailsList.get(17) + "	"
				+ messageDetailsList.get(18) + "		" + messageDetailsList.get(19) + "");
		System.out.println(messageDetailsList.get(20) + "		" + messageDetailsList.get(21) + "	"
				+ messageDetailsList.get(22) + "		" + messageDetailsList.get(23) + "");
		System.out.println(messageDetailsList.get(24) + "		" + messageDetailsList.get(25) + "	"
				+ messageDetailsList.get(26) + "		" + messageDetailsList.get(27) + "");
		System.out.println(messageDetailsList.get(28) + "		" + messageDetailsList.get(29) + "	"
				+ messageDetailsList.get(30) + "		" + messageDetailsList.get(31) + "");
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
		System.out.println("Player " + messageDetailsList.get(4) + " has " + messageDetailsList.get(5) + " Blue "
				+ messageDetailsList.get(6) + " Red " + messageDetailsList.get(7) + " Yellow Followers ");
		System.out.println("Player " + messageDetailsList.get(8) + " has " + messageDetailsList.get(9) + " Blue "
				+ messageDetailsList.get(10) + " Red " + messageDetailsList.get(11) + " Yellow Followers ");

	}

	/**
	 * Randomly number your 8 regions (for power struggle resolution order)
	 * Purpose: Assign the country randomly for each number Initiated by: Server
	 * Data: Country Cards Message: 04: < Country 1 > , <Country 2 >, <Country 3
	 * > …… <Country 8> Eg: 04: MO,NO...ES
	 * 
	 * @param messageNumber
	 * @param messageDetailsList
	 */
	public static void randomlyNameRegion(String messageNumber, List<String> messageDetailsList) {
		System.out.println("Country  	Number");
		System.out.println(messageDetailsList.get(0) + "  		" + 1);
		System.out.println(messageDetailsList.get(1) + "  		" + 2);
		System.out.println(messageDetailsList.get(2) + "  		" + 3);
		System.out.println(messageDetailsList.get(3) + "  		" + 4);
		System.out.println(messageDetailsList.get(4) + "  		" + 5);
		System.out.println(messageDetailsList.get(5) + " 	 	" + 6);
		System.out.println(messageDetailsList.get(6) + " 	 	" + 7);
		System.out.println(messageDetailsList.get(7) + " 	 	" + 8);

	}

	public static void playerTurn(String messageNumber, List<String> messageDetailsList) {

		System.out.println("Player " + messageDetailsList.get(0) + " is selected.");
		if (Utility.getInstance().GetPlayerName().equals(messageDetailsList.get(0))) {

			System.out.println("Which card you wish to play ? ");
			System.out.println("For card choose from below: ");
			System.out.println("Supporter card : 1 ");
			System.out.println("Assemble card : 2 ");
			System.out.println("Manoeuvre card : 3 ");
			System.out.println("OutManoeuvre card : 4 ");
			System.out.println("Neigotiate card : 5 ");
			System.out.println("Pass the turn  card : 6");

			String cardNum = System.console().readLine();

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
		String choice = System.console().readLine();
		System.out.println("Enter Region to support    " + "Moray : MO\r\n" + "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n" + "Northumbria: NO\r\n" + "Warwick: WA\r\n" + "Gwynedd: GW\r\n" + "Essex: ES\r\n"
				+ "Devon: DE\r\n" + "France: FR\r\n" + "");
		String region = System.console().readLine();
		String message = "07:" + Utility.getInstance().GetPlayerName() + "," + choice + "," + region;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
		drawTheSupportor();
	}

	private static void assembleCard() {
		System.out.println("Enter First Region to support    " + "Moray : MO\r\n" + "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n" + "Northumbria: NO\r\n" + "Warwick: WA\r\n" + "Gwynedd: GW\r\n" + "Essex: ES\r\n"
				+ "Devon: DE\r\n" + "France: FR\r\n" + "");
		String region1 = System.console().readLine();
		System.out.println("Enter the follower first color to add: [R/B/Y]");
		String color1 = System.console().readLine();
		System.out.println("Enter Second Region to support    " + "Moray : MO\r\n" + "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n" + "Northumbria: NO\r\n" + "Warwick: WA\r\n" + "Gwynedd: GW\r\n" + "Essex: ES\r\n"
				+ "Devon: DE\r\n" + "France: FR\r\n" + "");
		String region2 = System.console().readLine();
		System.out.println("Enter the follower second color to add: [R/B/Y]");
		String color2 = System.console().readLine();
		System.out.println("Enter Third Region to support    " + "Moray : MO\r\n" + "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n" + "Northumbria: NO\r\n" + "Warwick: WA\r\n" + "Gwynedd: GW\r\n" + "Essex: ES\r\n"
				+ "Devon: DE\r\n" + "France: FR\r\n" + "");
		String region3 = System.console().readLine();
		System.out.println("Enter the follower third color to add [R/B/Y]: ");
		String color3 = System.console().readLine();
		String message = "08:" + region1 + "," + color1 + "," + region2 + "," + color2 + "," + region3 + "," + color3;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
		drawTheSupportor();
	}

	private static void manoeuvre() {
		System.out.println("Enter the Region1 seperated by space with color 1 to swap");
		String part1 = System.console().readLine();
		String[] data1 = part1.split(" ");
		System.out.println("Enter the Region2 seperated by space with color 2 to swap");
		String part2 = System.console().readLine();
		String[] data2 = part2.split(" ");
		String message = "09:" + data1[0] + "," + data1[1] + "," + data2[0] + "," + data2[1];
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
		drawTheSupportor();
	}

	private static void outManoeuvre() {
		System.out.println("Enter the Region1 seperated by space with 2 color to swap");
		String part1 = System.console().readLine(); 
		String[] data1 = part1.split(" ");
		System.out.println("Enter the Region2 seperated by space with color 1 to swap");
		String part2 = System.console().readLine();
		String[] data2 = part2.split(" ");
		String message = "10:" + data1[0] + "," + data1[1] + "," + data2[0] + "," + data2[1];
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
		drawTheSupportor();
	}
	
	private static void negotiate() {
		System.out.println("Negotiate: Enter country to swap from");
		String country1 = System.console().readLine();
		System.out.println("Enter country to swap with");
		String country2 = System.console().readLine();
		String message = "11:" + country1 + "," + country2;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
		drawTheSupportor();
	}
	
	private static void passTheTurn() {
		System.out.println(" Trun passed to other player. ");
		String message = "15:Pass";
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}
	
	private static void drawTheSupportor(){
		System.out.println("Please Enter the country name :");
		String part1 = System.console().readLine(); 
		System.out.println("Please Enter the follower : (B/Y/R)");
		String part2 = System.console().readLine(); 
		String message = "12:" + part1 + "," + part2;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}

	public static void winnerplayer(String messageNumber, List<String> messageDetailsList) {
		System.out.println(" Player "+ messageDetailsList.get(0) + " is Winner !! ");
		System.out.println("Winner type is "+messageDetailsList.get(1));
		
	}

	public static void allInfo(String messageNumber, List<String> messageDetailsList) {
		// TODO Auto-generated method stub
		System.out.println("It was" + messageDetailsList.get(0) + "Turn");
		if(messageDetailsList.get(1).equals("A")) {
			System.out.println("Assemble Card was played");
			System.out.println(messageDetailsList.get(3) + "was added to " + messageDetailsList.get(2));
			System.out.println(messageDetailsList.get(5) + "was added to " + messageDetailsList.get(4));
			System.out.println(messageDetailsList.get(7) + "was added to " + messageDetailsList.get(6));
			
			System.out.println(messageDetailsList.get(9) + "was drawn from " + messageDetailsList.get(8));
			
		}
		if(messageDetailsList.get(1).equals("S")) {
			System.out.println("Supporter Card was played");
			System.out.println("Two supporter were added to" + messageDetailsList.get(2) + "Region of Country " + messageDetailsList.get(3));
		}
		if(messageDetailsList.get(1).equals("M")) {
			System.out.println("Manoeuvre Card was played");
			System.out.println(messageDetailsList.get(3) + "was added to " + messageDetailsList.get(2));
			System.out.println(messageDetailsList.get(5) + "was added to " + messageDetailsList.get(4));
		}
		if(messageDetailsList.get(1).equals("0")) {
			System.out.println("OutManoeuvre Card was played");
			System.out.println(messageDetailsList.get(3) + " and "+ messageDetailsList.get(4) + "was added to " + messageDetailsList.get(2));
			System.out.println(messageDetailsList.get(6) + "was added to " + messageDetailsList.get(5));
			
		}
		if(messageDetailsList.get(1).equals("N")) {
			System.out.println("Negotiate Card was played");
			System.out.println("Country" + messageDetailsList.get(3) + "is now swapped with " + messageDetailsList.get(4));
		
		}
		
		
	}
	
	public static void supporterCard() throws InterruptedException {
		System.out.println("Choose Scotish(S) Welish(W) English(E) Support Card");
		String choice=System.console().readLine();
		System.out.println("Enter Region to support    "
				+ "Moray : MO\r\n"
				+ "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n"
				+ "Northumbria: NO\r\n"
				+ "Warwick: WA\r\n"
				+ "Gwynedd: GW\r\n"
				+ "Essex: ES\r\n"
				+ "Devon: DE\r\n"
				+ "France: FR\r\n"
				+ "");
		String region=System.console().readLine();
		String message="07:"+Utility.getInstance().GetPlayerName()+","+choice+","+region;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}
	
	public static void assembleCard() throws InterruptedException{
		System.out.println("Enter First Region to support    "
				+ "Moray : MO\r\n"
				+ "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n"
				+ "Northumbria: NO\r\n"
				+ "Warwick: WA\r\n"
				+ "Gwynedd: GW\r\n"
				+ "Essex: ES\r\n"
				+ "Devon: DE\r\n"
				+ "France: FR\r\n"
				+ "");
		String region1=System.console().readLine();
		System.out.println("Enter the follower first color to add: [R/B/Y]");
		String color1=System.console().readLine();
		System.out.println("Enter Second Region to support    "
				+ "Moray : MO\r\n"
				+ "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n"
				+ "Northumbria: NO\r\n"
				+ "Warwick: WA\r\n"
				+ "Gwynedd: GW\r\n"
				+ "Essex: ES\r\n"
				+ "Devon: DE\r\n"
				+ "France: FR\r\n"
				+ "");
		String region2=System.console().readLine();
		System.out.println("Enter the follower second color to add: [R/B/Y]");
		String color2=System.console().readLine();
		System.out.println("Enter Third Region to support    "
				+ "Moray : MO\r\n"
				+ "Strathclyde : ST\r\n"
				+ "Lancaster: LA\r\n"
				+ "Northumbria: NO\r\n"
				+ "Warwick: WA\r\n"
				+ "Gwynedd: GW\r\n"
				+ "Essex: ES\r\n"
				+ "Devon: DE\r\n"
				+ "France: FR\r\n"
				+ "");
		String region3=System.console().readLine();
		System.out.println("Enter the follower third color to add [R/B/Y]: ");
		String color3=System.console().readLine();
		String message = "08:"+region1+","+color1+","+region2+","+color2+","+region3+","+color3;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}
	
	public static void manoeuvre() throws InterruptedException{
		System.out.println("Enter the Region1 seperated by space with color 1 to swap");
		String part1=System.console().readLine();
		String[] data1=part1.split(" ");
		System.out.println("Enter the Region2 seperated by space with color 2 to swap");
		String part2=System.console().readLine();
		String[] data2=part2.split(" ");
		String message = "09:"+data1[0]+","+data1[1]+","+data2[0]+","+data2[1];
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}
	
//	public static void outManoeuvre() throws InterruptedException{
//		
//	}
	
	public static void negotiate() throws InterruptedException{
		System.out.println("Negotiate: Enter country to swap from");
		String country1 = System.console().readLine();
		System.out.println("Enter country to swap with");
		String country2 = System.console().readLine();
		String message = "11:"+country1+","+country2;
		Utility.writeFile(Utility.getInstance().getFileWritePath(), message);
	}
}
