package com.KindIsDeadPlayer;

import static java.nio.file.StandardOpenOption.WRITE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {

	private String PlayerName;
	private String writefilepath;
	private String readfilepath;
	private static volatile Utility Utility = null;

	Utility() {
		// private constructor
	}

	// singleton object creation
	public static Utility getInstance() {
		if (Utility == null) {
			synchronized (Utility.class) {
				if (Utility == null) {
					Utility = new Utility();
				}
			}
		}
		return Utility;
	}

	public void SetPlayerName(String name) {
		this.PlayerName = name;
	}

	public String GetPlayerName() {
		return this.PlayerName;
	}

	public String getFileWritePath() {
		return writefilepath;
	}

	public void setFileWritePath(String fileWritePath) {
		this.writefilepath = fileWritePath;
	}


	public static void readFile(String filename, boolean canBreak) throws InterruptedException, IOException {
		String line;
		try {
			LineNumberReader lnr =new LineNumberReader(new FileReader(filename));
			while (!canBreak) {
				line = lnr.readLine();
				if (line == null || line.isEmpty()) {				
					Thread.sleep(2400);
					continue;
				}
				canBreak = parseMessage(line);
				if (canBreak)
					break;
			}
			lnr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	public static Boolean parseMessage(String message) throws InterruptedException {

		String[] messageArray = message.split(":");
		String[] messageDetails = messageArray[1].split(",");
		String messageNumber = messageArray[0];
		List<String> messageDetailsList = new ArrayList<>(Arrays.asList(messageDetails));

		if ("02".equals(messageNumber))
			PlayerProcessing.populateMapRandomly(messageNumber, messageDetailsList);
		else if ("03".equals(messageNumber))
			PlayerProcessing.distributeRandomFollowers(messageNumber, messageDetailsList);
		else if ("04".equals(messageNumber))
			PlayerProcessing.randomlyNameRegion(messageNumber, messageDetailsList);
		else if ("06".equals(messageNumber))
			PlayerProcessing.playerTurn(messageNumber, messageDetailsList);
		else
			return true;

		return false;

	}

	public static void writeFile(String filePath, String message) {
		try {
			message= message+"\n";
			Path path = Paths.get(filePath);
			OutputStream outputStream = Files.newOutputStream(path, WRITE);
			outputStream.write(message.getBytes());
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getReadfilepath() {
		return readfilepath;
	}

	public void setReadfilepath(String readfilepath) {
		this.readfilepath = readfilepath;
	}

}
