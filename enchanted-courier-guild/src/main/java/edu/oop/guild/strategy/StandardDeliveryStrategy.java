package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class StandardDeliveryStrategy implements DeliveryCostStrategy {

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
		
		return packageAdd + (request.getWeightKg()) + (request.getDistanceLeagues() * 2) + (request.isFragile() ? 5 : 0);
	}

}
