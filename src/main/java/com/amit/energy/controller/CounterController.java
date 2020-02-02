package com.amit.energy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amit.energy.dto.CounterDTO;
import com.amit.energy.service.CounterService;

@RestController
public class CounterController {
	
	@Autowired
	private CounterService counterService;

	@RequestMapping(value = "/counter_callback", method = RequestMethod.POST)
	public void uploadCounterConsumption(@RequestBody CounterDTO counterDto) {
		System.out.println("Im here!");
		counterService.processCounterConsumption(counterDto);
	}
	
}
