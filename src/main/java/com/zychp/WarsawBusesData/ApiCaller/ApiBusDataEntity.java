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
        return "ApiBusDataEntity{" +
                "Lat=" + Lat +
                ", Lon=" + Lon +
                ", Time='" + Time + '\'' +
                ", Lines='" + Lines + '\'' +
                ", Brigade='" + Brigade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApiBusDataEntity)) return false;

        ApiBusDataEntity that = (ApiBusDataEntity) o;

        if (!Lat.equals(that.Lat)) return false;
        if (!Lon.equals(that.Lon)) return false;
        if (!Time.equals(that.Time)) return false;
        if (!Lines.equals(that.Lines)) return false;
        return Brigade.equals(that.Brigade);
    }
}
