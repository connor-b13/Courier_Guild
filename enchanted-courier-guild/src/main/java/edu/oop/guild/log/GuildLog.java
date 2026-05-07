package edu.oop.guild.log;

import java.util.ArrayList;
import java.util.List;

public class GuildLog {

	private static GuildLog instance;
	
	private final List<String> log = new ArrayList<>();
	
	private GuildLog() {}
	
	public static GuildLog getInstance() {
		if(instance == null) {
			instance = new GuildLog();
		}
		return instance;
	}
	
	public void record(String entry) {
		if(entry == null) {
			throw new NullPointerException("Cannot input null string.");
		}
		log.add(entry);
	}
	
	public void clear() {
		log.clear();
	}
	
	public int size() {
		return log.size();
	}
	
	public List<String> entries() {
		return List.copyOf(this.log);
	}
}
