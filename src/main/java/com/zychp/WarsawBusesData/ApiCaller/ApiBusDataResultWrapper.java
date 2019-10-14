package com.zychp.WarsawBusesData.ApiCaller;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ApiBusDataResultWrapper {
    private List<ApiBusDataEntity> result;

    public ApiBusDataResultWrapper() {
        result = new ArrayList<>();
    }
}
