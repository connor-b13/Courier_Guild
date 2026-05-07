package edu.oop.guild.creature;

import edu.oop.guild.model.RealmType;

public class TunnelMole implements Creature {

	@Override
	public RealmType nativeRealm() {
		// TODO Auto-generated method stub
		return RealmType.UNDERGROUND;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Grumble the Tunnel Mole";
	}

	@Override
	public int carryingCapacityKg() {
		// TODO Auto-generated method stub
		return 30;
	}

}
