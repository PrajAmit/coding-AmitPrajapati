package com.amit.energy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amit.energy.dto.VillageConsumptionDTO;
import com.amit.energy.repository.ConsumptionRepository;

@Component
public class ConsumptionService {
	
	@Autowired
	private ConsumptionRepository consumptionRepository;
	
	//This could be better, need to have a more generic way to return the object
	public List<VillageConsumptionDTO> getVillageConsumption() {
		List<Object[]> entityResponse = consumptionRepository.getConsumptionForLastDay();
		List<VillageConsumptionDTO> villages = new ArrayList<>();
		for(Object[] consumption : entityResponse) {
			VillageConsumptionDTO dto = new VillageConsumptionDTO();
			dto.setVillageName(consumption[0].toString());
			dto.setConsumption(new Double(consumption[1].toString()));
			villages.add(dto);
		}
		return villages;
	}
}
