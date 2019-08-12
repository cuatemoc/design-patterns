package pl.slemjet.proxy.protection;

import lombok.extern.java.Log;

@Log
public class CarProxy extends Car {

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.getAge() > 16)
            super.drive();
        else
            log.warning(String.format("Driver %s is too young to drive", driver.toString()));
    }
}
