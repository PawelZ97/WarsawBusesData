package com.zychp.WarsawBusesData;

import com.zychp.WarsawBusesData.Hibernate.BusData;
import com.zychp.WarsawBusesData.Hibernate.BusDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusDataController {
    private final BusDataRepository busDataRepository;

    @Autowired
    public BusDataController(BusDataRepository busDataRepository) {
        this.busDataRepository = busDataRepository;
    }

    @GetMapping("/buses")
    public Iterable<BusData> getBusesData() {
        return busDataRepository.findAll();
    }
}
