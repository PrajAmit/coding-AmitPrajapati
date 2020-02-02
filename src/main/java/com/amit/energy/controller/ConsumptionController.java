package com.amit.energy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.energy.dto.ConsumptionDTO;
import com.amit.energy.service.ConsumptionService;

@RestController
public class ConsumptionController {

	@Autowired
	private ConsumptionService consumptionService;

	@RequestMapping("/consumption_report/{duration}")
	public ConsumptionDTO getConsumptionReport(@PathVariable("duration") String duration) {
		return new ConsumptionDTO(consumptionService.getVillageConsumption());
	}
	
	@RequestMapping("/status")
	public String testApp() {
		return "GO!!!";
	}
}
