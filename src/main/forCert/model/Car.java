package main.forCert.model;

public class Car {
    private String name;
    private long price;

    public Car() {
        this.name = "BMW";
        this.price = 20000L;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
