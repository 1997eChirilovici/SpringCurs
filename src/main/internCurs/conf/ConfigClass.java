package main.internCurs.conf;

import main.internCurs.model.Broker;
import main.internCurs.model.Car;
import main.internCurs.model.Engineer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "main.internCurs.model")
public class ConfigClass {

    @Bean
    @Qualifier("bmw")
    public Car getCar() {
        Engineer engineer = new Engineer();
        engineer.setName("Ion");
        return new Car(engineer);
    }

    @Bean
    @Qualifier("audi")
    public Car getCar2() {
        return new Car(getEngineer());
    }

    @Bean
    public Engineer getEngineer() {
        Engineer engineer = new Engineer();
        engineer.setName("Iwan");
        return engineer;
    }

    @Bean
    public Broker getBroker(){
        return new Broker();
    }
}
