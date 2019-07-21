package pl.slemjet.bridge;

public class Circle extends Shape {

    private float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        getRenderer().renderCircle(radius);
    }

    @Override
    public void resize(float factor) {
        radius *= factor;
    }
}
