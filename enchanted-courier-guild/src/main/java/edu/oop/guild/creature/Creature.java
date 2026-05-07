package edu.oop.guild.creature;
import edu.oop.guild.model.*;

public interface Creature {
	
	RealmType nativeRealm();
	String name();
	int carryingCapacityKg();
	 
	default boolean canCarry(DeliveryRequest req) {
		if(req.getWeightKg() > this.carryingCapacityKg()) {
			return false;
		}
		if(req.getDestinationRealm() != this.nativeRealm()) {
			return false;
		}
		return true;		
	}
}
