package edu.oop.guild.notification;

import edu.oop.guild.model.*;

public class OwlScrollNotificationAdapter implements NotificationChannel {

	public OwlScrollNotificationAdapter(LegacyOwlScroll owlScroll) {
		if(owlScroll == null) {
			throw new NullPointerException("Cannot adapt to a null LegacyOwlScroll");
		}
	}

	@Override
	public String send(DeliveryPlan plan) {
		RealmType type = plan.getRequest().getDestinationRealm();
	
		return LegacyOwlScroll.dispatchScroll(type.displayName(), plan.summary());
	}
}
