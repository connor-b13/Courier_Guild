package edu.oop.guild.model;

import edu.oop.guild.creature.Creature;

public class DeliveryPlan {

	private DeliveryRequest request;
	private Creature courier;
	private String sealedLabel;
	private int priceInCoins;
	
	public DeliveryPlan(DeliveryRequest request, Creature courier, String sealedLabel, int priceInCoins) {
		if (request == null) {
			throw new NullPointerException("request cannot be null");
		}
		if (courier == null) {
			throw new NullPointerException("courier cannot be null");
		}
		if (sealedLabel == null) {
			throw new NullPointerException("sealedLabel cannot be null");
		}
		if (priceInCoins <= 0) {
			throw new IllegalArgumentException("priceInCoins must be positive");
		}
		
		this.request = request;
		this.courier = courier;
		this.sealedLabel = sealedLabel;
		this.priceInCoins = priceInCoins;
	}

	public DeliveryRequest getRequest() {
		return request;
	}

	public Creature getCourier() {
		return courier;
	}

	public String getSealedLabel() {
		return sealedLabel;
	}

	public int getPriceInCoins() {
		return priceInCoins;
	}
	
//	public String summary() {
//		return String.format("%s delivers ☁ %s to %s ☁ for %d coins", courier.name(), sealedLabel, request.getDestinationRealm() ,priceInCoins);
//	}

	
	public String summary() {
		return String.format("%s delivers %s for %d coins", courier.name(), sealedLabel, priceInCoins);
	}

}
