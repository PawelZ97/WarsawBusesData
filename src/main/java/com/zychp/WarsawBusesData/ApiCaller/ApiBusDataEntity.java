package com.zychp.WarsawBusesData.ApiCaller;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
public class ApiBusDataEntity {
    public BigDecimal Lat;
    public BigDecimal Lon;
    public String Time;
    public String Lines;
    public String Brigade;

    @Override
    public String toString() {
        return "GetBusData{" +
                "Lat=" + Lat +
                ", Lon=" + Lon +
                ", Time='" + Time + '\'' +
                ", Lines='" + Lines + '\'' +
                ", Brigade='" + Brigade + '\'' +
                '}';
    }
}
