package pl.slemjet.factory.nested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PointTest {

    @Test
    void newCartesianPointTest() {
        Point point = Point.Factory.newCartesianPoint(1, 2);
        System.out.println(point);
        assertNotNull(point);
    }

    @Test
    void newPolarPointTest() {
        Point point = Point.Factory.newPolarPoint(1, 90);
        System.out.println(point);
        assertNotNull(point);
    }

}