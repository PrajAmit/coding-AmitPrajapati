package com.amit.energy.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.amit.energy.dto.VillageConsumptionDTO;
import com.amit.energy.repository.ConsumptionRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ConsumptionServiceUnitTest {

	@Mock
	private ConsumptionRepository consumptionRepository;

	@InjectMocks
	private ConsumptionService consumptionService;

	@Test
	public void testGetVillageConsumption() {
		List<Object[]> entityResponse = new ArrayList<>();
		Object[] temp = { "Village", 100.5 };
		entityResponse.add(temp);

		when(consumptionRepository.getConsumptionForLastDay()).thenReturn(entityResponse);

		List<VillageConsumptionDTO> dtoList = consumptionService.getVillageConsumption();
		VillageConsumptionDTO dto = dtoList.get(0);

		assertEquals(dtoList.size(), entityResponse.size());
		assertEquals(dto.getConsumption(), 100.5);
		assertEquals(dto.getVillageName(), "Village");
		
		
	}
}
