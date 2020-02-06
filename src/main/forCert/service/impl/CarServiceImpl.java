package main.forCert.service.impl;

import main.forCert.repo.CarRepository;
import main.forCert.service.CarService;
import org.springframework.stereotype.Component;

//@Component(value = "carService")
@Component
public class CarServiceImpl implements CarService {

    CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public long getCarPrice() {
        return carRepository.getCarPrice();
    }
}
