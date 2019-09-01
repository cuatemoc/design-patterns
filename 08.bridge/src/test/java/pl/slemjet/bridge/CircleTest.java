package pl.slemjet.bridge;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void test() {
        RasterRenderer rasterRenderer = new RasterRenderer();
        VectorRenderer vectorRenderer = new VectorRenderer();
        Circle rasterCircle = new Circle(rasterRenderer, 5);
        rasterCircle.draw();
        rasterCircle.resize(2);
        rasterCircle.draw();

        Circle vectorCircle = new Circle(vectorRenderer, 2);
        vectorCircle.draw();
        vectorCircle.resize(3);
        vectorCircle.draw();
    }
}