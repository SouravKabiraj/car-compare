package com.craft.carcompare.services;

import com.craft.carcompare.models.*;
import com.craft.carcompare.repositories.CarModelRepository;
import com.craft.carcompare.repositories.ComparableAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CarComparisonService {
    @Autowired
    ComparableAttributeRepository comparableAttributeRepository;
    @Autowired
    CarModelRepository carModelRepository;

    public CarComparisonReport compare(List<String> carModelIds) {
        CarComparisonReport carComparisonReport = new CarComparisonReport();
        carModelIds.forEach(id -> {
            Optional<CarModel> optionalCarModel = carModelRepository.findById(id);
            if (optionalCarModel.isPresent()) {
                CarModel carModel = optionalCarModel.get();
                Map<ComparableAttributeName, ComparableAttribute> nameToComparableAttribute = new HashMap<>();
                comparableAttributeRepository.findByCarModelId(id).forEach(att -> nameToComparableAttribute.put(att.getAttributeName(), att));
                carComparisonReport.addCarModel(new CarModelWithAttributes(carModel, nameToComparableAttribute));
            }
        });
        return carComparisonReport;
    }
}
