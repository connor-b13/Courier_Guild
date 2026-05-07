package edu.oop.guild.seal;

public class GlowStoneSeal implements PackageSeal {

	@Override
	public int durability() {
		return 12;
	}

	@Override
	public String apply(String arg) {
		if(arg == null) {
			throw new NullPointerException("Cannot enter a null string.");
		}
		 return "◆ " + arg + " ◆";
	}

}
