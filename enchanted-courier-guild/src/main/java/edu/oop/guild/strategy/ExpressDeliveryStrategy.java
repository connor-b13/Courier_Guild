package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class ExpressDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("request cannot be null");
		}
		
		// Reverse engineering math is HARD
		// Halving the weight multi and fragile bonus for underground makes things line up. Feels kinda hacky.
		int weightMultiplier = switch (request.getDestinationRealm()) {
			case UNDERGROUND -> 2;
			case SKY -> 4;
		};
		int fragileBonus = switch (request.getDestinationRealm()) {
			case UNDERGROUND -> 5;
			case SKY -> 10;
		};
		
		return DeliveryCostStrategy.packageAdd(request.getPackageType()) + (request.getWeightKg() * weightMultiplier) + (request.getDistanceLeagues() * 5) + (request.isFragile() ? fragileBonus : 0);
	}

}
