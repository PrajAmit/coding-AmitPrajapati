package com.amit.energy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amit.energy.entity.VillageConsumption;

@Repository
public interface ConsumptionRepository extends CrudRepository<VillageConsumption, Long> {

	@Query(value = "SELECT village_name, sum(consumption) as consumption FROM VILLAGE_CONSUMPTION WHERE creation_time >= SYSDATE - 1 group by village_name", nativeQuery = true)
	public List<Object[]> getConsumptionForLastDay();
}
