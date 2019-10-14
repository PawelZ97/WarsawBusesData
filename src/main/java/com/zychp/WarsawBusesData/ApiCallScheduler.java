package com.zychp.WarsawBusesData;

import com.zychp.WarsawBusesData.ApiCaller.ApiBusDataEntity;
import com.zychp.WarsawBusesData.ApiCaller.ApiCall;
import com.zychp.WarsawBusesData.Hibernate.BusData;
import com.zychp.WarsawBusesData.Hibernate.BusDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApiCallScheduler {
    @Autowired
    private BusDataRepository busDataRepository;
    private int apiCallounter = 1;

    private static final Logger log = LoggerFactory.getLogger(ApiCallScheduler.class);

    @Scheduled(fixedRate = 10000)
    public void toBase() {
        ApiCall apiCall = new ApiCall("1", "131");
        List<ApiBusDataEntity> responseBusData = apiCall.makeCall();
        for (ApiBusDataEntity apiBusDataEntity : responseBusData) {
            busDataRepository.save(new BusData(apiBusDataEntity));
        }
        log.info("Api Call no: {}, entries: {}",this.apiCallounter++, responseBusData.size());
    }
}