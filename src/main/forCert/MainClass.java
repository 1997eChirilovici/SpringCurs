package main.forCert;

import main.forCert.conf.ConfigCar;
import main.forCert.controller.CarController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(ConfigCar.class);
        CarController car = app.getBean(CarController.class);
        car.showPrice();

//        Cat cat = (Cat) app.getBean("cat");
//        System.out.println(cat);
//        cat.setName("Tom");
//        cat.setAge(2);
//        System.out.println(cat);
    }
}
