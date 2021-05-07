package com.KindIsDeadPlayer;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		String playerName = args[0];
		System.out.println("This is a Player " + playerName );
		
		String FilepathRead = "/tmp/To" + playerName;
		String Writepath = "/tmp/From" + playerName;
		
		Utility.getInstance().SetPlayerName(playerName);
		Utility.getInstance().setFileWritePath(Writepath);
		Utility.getInstance().setReadfilepath(FilepathRead);
		Utility.readFile(FilepathRead, false);			
	}

}

