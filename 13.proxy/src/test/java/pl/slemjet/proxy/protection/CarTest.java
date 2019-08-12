package pl.slemjet.proxy.protection;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void test() {
        Car car = new Car(new Driver(12));
        car.drive();

        Car car2 = new CarProxy(new Driver(12));
        car2.drive();
    }
}