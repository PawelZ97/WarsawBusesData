package com.zychp.WarsawBusesData;

import com.zychp.WarsawBusesData.Hibernate.BusDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WarsawBusesDataApplication {
	@Autowired private BusDataRepository busDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(WarsawBusesDataApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			busDataRespository.save(new BusData(new BigDecimal(50),new BigDecimal(20),"1","131_TEST","1"));
//		};
//	}

}
