package pl.slemjet.factory.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void newCartesianPointTest() {
        Point point = Point.newCartesianPoint(1, 2);
        System.out.println(point);
        assertNotNull(point);
    }

    @Test
    void newPolarPointTest() {
        Point point = Point.newPolarPoint(1, 90);
        System.out.println(point);
        assertNotNull(point);
    }
}