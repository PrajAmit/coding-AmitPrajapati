package com.amit.energy.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.amit.energy.dto.CounterDTO;
import com.amit.energy.entity.VillageConsumption;
import com.amit.energy.repository.ConsumptionRepository;

@Component
public class CounterService {
	
	@Autowired
	private ConsumptionRepository consumptionRepository;
	
	private final String URL = "https://europe-west2-zenhomes-development-project.cloudfunctions.net/counters/{id}";
	
	public void processCounterConsumption(CounterDTO counterDto) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Long> params = new HashMap<>();
		params.put("id", counterDto.getCounterId());
		CounterDTO counterResponse = restTemplate.getForObject(URL, CounterDTO.class, params);
		
		VillageConsumption consumptionEntity = new VillageConsumption(counterResponse.getVillage().getName(), counterDto.getAmount(), new Date());
		consumptionRepository.save(consumptionEntity);
	}
}
