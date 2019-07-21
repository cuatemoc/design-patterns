package pl.slemjet.bridge;

import java.util.logging.Logger;

public class VectorRenderer implements Renderer {

    private static final Logger log = Logger.getLogger(VectorRenderer.class.getName());

    @Override
    public void renderCircle(float radius) {
        log.info("Vector renderer: rendering circle with radius: " + radius);
    }
}
