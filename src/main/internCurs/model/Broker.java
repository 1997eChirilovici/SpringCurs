package main.internCurs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Broker {

    @Autowired
    @Qualifier("Audi")
    private Car car;

    private String brokerName = "Edward";

    public String getEngineerAndBrokerResponsible() {
        return "Broker name: " + brokerName + "\n" +
                "Engineer name: " + car.getEngineer().getName();
    }

    @Override
    public String toString() {
        return "Broker{" +
                "car=" + car +
                ", brokerName='" + brokerName + '\'' +
                '}';
    }
}
