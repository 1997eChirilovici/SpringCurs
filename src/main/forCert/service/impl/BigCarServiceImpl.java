package main.forCert.service.impl;

import main.forCert.repo.CarRepository;
import main.forCert.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bigCars")
public class BigCarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public long getCarPrice() {
        return carRepository.getBigCarPrice();
    }
}
