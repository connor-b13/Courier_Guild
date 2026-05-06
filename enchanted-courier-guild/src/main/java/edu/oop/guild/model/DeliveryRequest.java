package edu.oop.guild.model;

public class DeliveryRequest {

	private PackageType packageType;
	private int weightKg;
	private int distanceLeagues;
	private RealmType destinationRealm;
	private boolean fragile;
	
	public DeliveryRequest(PackageType packageType, int weight, int distance, RealmType destination, boolean fragile) {
		if (packageType == null) {
			throw new NullPointerException("packageType cannot be null");
		}
		if (weight <= 0) {
			throw new IllegalArgumentException("weight cannot be null");
		}
		if (distance <= 0) {
			throw new IllegalArgumentException("distance cannot be null");
		}
		if (destination == null) {
			throw new NullPointerException("destination cannot be null");
		}
		
		this.packageType = packageType;
		this.weightKg = weight;
		this.distanceLeagues = distance;
		this.destinationRealm = destination;
		this.fragile = fragile;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public int getDistanceLeagues() {
		return distanceLeagues;
	}

	public RealmType getDestinationRealm() {
		return destinationRealm;
	}

	public boolean isFragile() {
		return fragile;
	}

	
}
