package com.alertreceiver.model;

public class Alerts {
	
		private String alertEvent;
		private String alertMessage;

		public String getAlertEvent() {
			return alertEvent;
		}

		public void setAlertEvent(String alertEvent) {
			this.alertEvent = alertEvent;
		}

		public String getAlertMessage() {
			return alertMessage;
		}

		public void setAlertMessage(String alertMessage) {
			this.alertMessage = alertMessage;
		}

		public Alerts() {
			super();
		}

		@Override
		public String toString() {
			return "Alerts [alertEvent=" + alertEvent + ", alertMessage=" + alertMessage + "]";
		}
		
		

}