package pl.slemjet.decorator.dynamic;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void test() {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 50);
        System.out.println(myCircle.info());

        // cannot call myCircle.resize()
    }
}