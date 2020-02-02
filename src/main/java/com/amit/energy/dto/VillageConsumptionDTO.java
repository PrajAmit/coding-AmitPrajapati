package com.amit.energy.dto;

public class VillageConsumptionDTO {

	private String villageName;
	private double consumption;

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	@Override
	public String toString() {
		return "VillageConsumptionDTO [villageName=" + villageName + ", consumption=" + consumption + "]";
	}

}
