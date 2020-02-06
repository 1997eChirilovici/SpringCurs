package main.forCert.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"main.forCert.service", "main.forCert.repo", "main.forCert.controller"})
public class ConfigCar {

//    @Bean
//    public Cat getCat(){
//        return new Cat();
//    }

//    @Bean(value = "car")
//    public CarService getCarService(){
//        return new CarServiceImpl(getCarRepository());
//    }
//
//    @Bean
//    public CarRepository getCarRepository(){
//        return new CarRepository();
//    }
}
