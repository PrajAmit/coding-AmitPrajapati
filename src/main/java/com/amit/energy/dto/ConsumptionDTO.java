package com.amit.energy.dto;

import java.util.List;

public class ConsumptionDTO {

	private List<VillageConsumptionDTO> villages;

	public ConsumptionDTO() {
		super();
	}

	public ConsumptionDTO(List<VillageConsumptionDTO> villages) {
		super();
		this.villages = villages;
	}

	public List<VillageConsumptionDTO> getVillages() {
		return villages;
	}

	public void setVillages(List<VillageConsumptionDTO> villages) {
		this.villages = villages;
	}

}
