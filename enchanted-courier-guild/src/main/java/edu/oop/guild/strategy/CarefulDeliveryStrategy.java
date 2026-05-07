package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("request cannot be null");
		}
		
		return DeliveryCostStrategy.packageAdd(request.getPackageType()) + (request.getWeightKg() * 4) + (request.getDistanceLeagues() * 5);
	}

}
