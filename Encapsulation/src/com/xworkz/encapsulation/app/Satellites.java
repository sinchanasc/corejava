package com.xworkz.encapsulation.app;

public class Satellites {
	private String launchVehicle;
	private String size;
	private String payload;
	private String type;
	private String communication;
	
	@Override
	public String toString() {
		return "LaunchVehicle" + this.launchVehicle   +   "Size" + this.size +  "Type" + this.type  +  "Payload" + this.payload  +  "Communication" + this.communication;
	}
	
	public String getLaunchVehicle() {
		return launchVehicle;
	}
	public void setLaunchVehicle(String launchVehicle) {
		this.launchVehicle = launchVehicle;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}
		


}
