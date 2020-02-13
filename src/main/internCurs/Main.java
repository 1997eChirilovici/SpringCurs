package main.internCurs;

import main.internCurs.conf.ConfigClass;
import main.internCurs.model.Broker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Broker myBroker = context.getBean(Broker.class);

        System.out.println(myBroker.getEngineerAndBrokerResponsible());

    }

}
