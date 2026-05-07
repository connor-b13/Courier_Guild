package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;

public interface DeliveryCostStrategy {
	int estimateCoins(DeliveryRequest request);

	static int packageAdd(PackageType packageType) {
		return switch (packageType) {
			case FOOD -> 10;
			case POTION -> 15;
			case ARTIFACT -> 27;
		};
	}
}
