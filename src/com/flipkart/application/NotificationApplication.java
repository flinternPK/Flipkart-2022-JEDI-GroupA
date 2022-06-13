package com.flipkart.application;
import com.flipkart.service.NotificationServiceInterface;
import com.flipkart.service.NotificationServiceImplementation;
public class NotificationApplication {

	public static void main(String[] args) {
		NotificationServiceInterface notificationRef = new NotificationServiceImplementation();
		notificationRef.showRegistrationReciept(null);

	}

}
