package main.forCert.repo;

import main.forCert.model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarRepository {

    public long getCarPrice() {
        return new Car().getPrice();
    }

    public long getBigCarPrice() {
        Car car = new Car();
        car.setPrice(40000L);
        return car.getPrice();
    }
}
