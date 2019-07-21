package pl.slemjet.bridge;

public abstract class Shape {

    private final Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    protected Renderer getRenderer() {
        return this.renderer;
    }

    public abstract void draw();

    public abstract void resize(float factor);
}
