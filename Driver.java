package com;

public class Driver {

	private int driverId;
	private String category;
	private String driverName;
	private double totaldistance;

	public Driver() {
	}

	public Driver(int driverId, String category, String driverName, double totaldistance) {
		super();
		this.driverId = driverId;
		this.category = category;
		this.driverName = driverName;
		this.totaldistance = totaldistance;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getTotaldistance() {
		return totaldistance;
	}

	public void setTotaldistance(double totaldistance) {
		this.totaldistance = totaldistance;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", category=" + category + ", driverName=" + driverName
				+ ", totaldistance=" + totaldistance + "]";
	}
}
