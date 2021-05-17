package com.KindIsDeadPlayer;

public class PlayerInfoValidation {

	
	private static PlayerInfoValidation playerInfoValidation = null;

	public static PlayerInfoValidation getInstance() {
		if (playerInfoValidation == null)
			playerInfoValidation = new PlayerInfoValidation();

		return playerInfoValidation;
	}
	
	public boolean validateLocation(String loca) {

		return GameParameter.getInstance().getLocationFollower().containsKey(loca);

	}
	
	public boolean validateFollower(String foll) {

		if( foll.equals("R") || foll.equals("Y") || foll.equals("B"))
			return true;

		return false;

	}
	
	public boolean validateSupporter(String foll) {
		
		if( foll.equals("S") || foll.equals("W") || foll.equals("E"))
			return true;

		return false;

	}
	
	
}
