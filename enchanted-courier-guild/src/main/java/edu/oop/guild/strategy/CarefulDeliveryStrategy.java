package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("request cannot be null");
		}
		
		int packageAdd = switch (request.getPackageType()) {
			case FOOD -> 10;
			case POTION -> 15;
			case ARTIFACT -> 27;
		};
		
		// Exact same as express delivery but the math still checks out?
		return packageAdd + (request.getWeightKg() * 4) + (request.getDistanceLeagues() * 5) + (request.isFragile() ? 10 : 0);
	}

}
