package edu.oop.guild.model;

public enum RealmType {
	SKY("Sky Kingdom"),
	UNDERGROUND("Underground Market");

	private String displayName;
	
	RealmType(String disp) {
		this.displayName = disp;
	}
	
	public String displayName() {
		return displayName;
	}
}
