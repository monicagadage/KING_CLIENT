package com.KindIsDeadPlayer;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		String playerName = args[0];
		System.out.println("\nThis is a Player "+ playerName);
		
		String FilepathRead = "/tmp/allto" + playerName;
		String Writepath = "/tmp/allfrom" + playerName;
		
		Utility.getInstance().SetPlayerName(playerName);
		Utility.getInstance().setFileWritePath(Writepath);
		Utility.getInstance().setReadfilepath(FilepathRead);
		Utility.readFile(FilepathRead, false);			
	}

}

