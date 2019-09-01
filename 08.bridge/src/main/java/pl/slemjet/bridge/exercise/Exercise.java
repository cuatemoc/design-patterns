package pl.slemjet.bridge.exercise;

public class Exercise {
}

abstract class Shape {
    public Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRender());
    }
}

interface Renderer {
    String whatToRender();
}

class VectorRenderer implements Renderer {

    @Override
    public String whatToRender() {
        return "lines";
    }
}

class RasterRenderer implements Renderer {

    @Override
    public String whatToRender() {
        return "pixels";
    }
}

class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
