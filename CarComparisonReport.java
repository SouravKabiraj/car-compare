package com.craft.carcompare.models;

import java.util.List;

public class CarComparisonReport {
    List<CarModelWithAttributes> carModelWithAttributes;

    public void addCarModel(CarModelWithAttributes carModel) {
        carModelWithAttributes.add(carModel);
    }
}

