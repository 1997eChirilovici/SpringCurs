package main.forCert.controller;


import main.forCert.service.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarController {

    CarService carService;

    public CarController(@Qualifier("bigCars") CarService carService) {
        this.carService = carService;
    }

    public void showPrice() {
        System.out.println(carService.getCarPrice());
    }
}
