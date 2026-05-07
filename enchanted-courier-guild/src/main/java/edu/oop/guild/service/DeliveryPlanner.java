package edu.oop.guild.service;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.factory.RealmFactory;
import edu.oop.guild.log.GuildLog;
import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.seal.PackageSeal;
import edu.oop.guild.strategy.DeliveryCostStrategy;

public class DeliveryPlanner {
	private RealmFactory factory;
	private DeliveryCostStrategy strategy;
	private GuildLog log;
	

	public DeliveryPlanner(RealmFactory factory, DeliveryCostStrategy strategy, GuildLog log) {
		if (factory == null) {
			throw new NullPointerException("factory cannot be null");
		}
		if (strategy == null) {
			throw new NullPointerException("strategy cannot be null");
		}
		if (log == null) {
			throw new NullPointerException("log cannot be null");
		}
		
		this.factory = factory;
		this.strategy = strategy;
		this.log = log;
	}

	public DeliveryPlan plan(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("request cannot be null");
		}
		
		Creature courier = factory.createCourier();
		
		if (!courier.canCarry(request)) {
			throw new IllegalStateException("Courier cannot carry this package");
		}
		
		PackageSeal seal = factory.createSeal();
		String sealedLabel = seal.apply(request.getPackageType().label() + " to " + request.getDestinationRealm().displayName());
		
		DeliveryPlan plan = new DeliveryPlan(request, courier, sealedLabel, strategy.estimateCoins(request));
		
		log.record(plan.summary());
		
		return plan;
	}

}
