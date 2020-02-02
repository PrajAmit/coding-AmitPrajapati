package com.amit.energy.dto;

public class CounterDTO {

	private long counterId;
	
    private double amount;
    
    private VillageDTO village;

    public long getCounterId() {
        return counterId;
    }

    public void setCounterId(long counterId) {
        this.counterId = counterId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

	public VillageDTO getVillage() {
		return village;
	}

	public void setVillage(VillageDTO village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "CounterDTO [counterId=" + counterId + ", amount=" + amount + ", village=" + village + "]";
	}
    
}
