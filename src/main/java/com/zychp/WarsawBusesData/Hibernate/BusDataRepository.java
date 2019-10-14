package com.zychp.WarsawBusesData.Hibernate;

import com.zychp.WarsawBusesData.Hibernate.BusData;
import org.springframework.data.repository.CrudRepository;

public interface BusDataRepository extends CrudRepository<BusData, Long> {
}
