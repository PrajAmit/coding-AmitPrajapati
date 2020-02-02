package com.amit.energy.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VillageConsumption {

	@Id
    @GeneratedValue
    private long id;
	
	private String villageName;
	private double consumption;
	
    private Date creationTime;
    
	public VillageConsumption() {
		super();
	}

	public VillageConsumption(String villageName, double consumption, Date creationTime) {
		super();
		this.villageName = villageName;
		this.consumption = consumption;
		this.creationTime = creationTime;
	}

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

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

}
