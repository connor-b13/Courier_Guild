package edu.oop.guild.factory;

import edu.oop.guild.model.RealmType;

public class RealmFactoryProvider {

	public RealmFactory forRealm(RealmType realmType) {
		if (realmType == null) {
			throw new NullPointerException("realmType cannot be null");
		}
		
		return switch (realmType) {
			case SKY -> new SkyRealmFactory();
			case UNDERGROUND -> new UndergroundRealmFactory();
		};
	}

}
