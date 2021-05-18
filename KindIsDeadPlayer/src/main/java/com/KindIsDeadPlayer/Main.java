package com.KindIsDeadPlayer;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		String playerName = args[0];
		String teamName = args[1];
		System.out.println("\nThis is a Player "+ playerName);
		
		String FilepathRead = "/tmp/"+teamName+"to" + playerName;
		String Writepath = "/tmp/"+teamName+"from" + playerName;
		
		Utility.getInstance().SetPlayerName(playerName);
		Utility.getInstance().setFileWritePath(Writepath);
		Utility.getInstance().setReadfilepath(FilepathRead);
		Utility.readFile(FilepathRead, false);			
	}

}
