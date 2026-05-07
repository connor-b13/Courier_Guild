package edu.oop.guild.notification;

public class LegacyOwlScroll {
	
	public LegacyOwlScroll() {}
	
	public static String dispatchScroll(String location, String message) {
		if(location == null || location.isBlank() || message == null || message.isBlank()) {
			throw new IllegalArgumentException("Message and Location must both be real");
		}
		return "Owl scroll sent to " + location + ": " + message;
	}
}
