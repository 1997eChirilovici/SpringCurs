package main.internCurs;

import main.internCurs.conf.ConfigClass;
import main.internCurs.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Car carBean = context.getBean(Car.class);

        System.out.println(carBean.getEngineer().getName());

    }

}
