package com.amit.energy.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.amit.energy.dto.CounterDTO;
import com.amit.energy.entity.VillageConsumption;
import com.amit.energy.repository.ConsumptionRepository;

@SpringBootTest
public class CounterServiceUnitTest {

	@Mock
	private ConsumptionRepository consumptionRepository;

	@InjectMocks
	private CounterService counterService;

	@Test
	public void testGetVillageConsumption() {
		CounterDTO counterDto = new CounterDTO();
		counterDto.setCounterId(1L);
		counterDto.setAmount(1000);
		
		counterService.processCounterConsumption(counterDto);
		verify(consumptionRepository, times(1)).save(any(VillageConsumption.class));
	}
}
