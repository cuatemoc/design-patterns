package pl.slemjet.proxy.protection;

import lombok.extern.java.Log;

@Log
public class Car implements Drivable{

    protected final Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        log.info(String.format("Driver %s drives the car", driver.toString()));
    }
}
