package pl.slemjet.composite;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphicObjectTest {

    @Test
    void test() {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.children.add(new Square("Red"));
        drawing.children.add(new Circle("Yellow"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Circle("Blue"));
        group.children.add(new Square("Blue"));
        drawing.children.add(group);

        Assertions.assertNotNull(drawing.toString());
        System.out.println(drawing);
    }
}