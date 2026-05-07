package edu.oop.guild.seal;

public class SkyRibbonSeal implements PackageSeal {

	@Override
	public int durability() {
		return 7;
	}

	@Override
	public String apply(String arg) {
		if(arg == null) {
			throw new NullPointerException("Cannot enter a null string.");
		}
		return "☁ " + arg + " ☁";
	}

}
