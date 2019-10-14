package com.zychp.WarsawBusesData.Hibernate;

import com.zychp.WarsawBusesData.ApiCaller.ApiBusDataEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
//@Table(uniqueConstraints={@UniqueConstraint(columnNames={"lat","lon","time","lines","brigade"})})
@Getter
@Setter
@NoArgsConstructor
public class BusData {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, precision = 9, scale = 7)
    private BigDecimal lat;
    @Column(nullable = false, precision = 9, scale = 7)
    private BigDecimal lon;
    @Column(nullable = false)
    private String time;
    @Column(nullable = false)
    private String lines;
    @Column(nullable = false)
    private String brigade;

//    public BusData(BigDecimal lat, BigDecimal lon, String time, String lines, String brigade) {
//        this.lat = lat;
//        this.lon = lon;
//        this.time = time;
//        this.lines = lines;
//        this.brigade = brigade;
//    }

    public BusData(ApiBusDataEntity bus) {
        this.lat = bus.getLat();
        this.lon = bus.getLon();
        this.time = bus.getTime();
        this.lines = bus.getLines();
        this.brigade = bus.getBrigade();
    }
}
