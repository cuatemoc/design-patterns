package pl.slemjet.bridge;

import java.util.logging.Logger;

public class RasterRenderer implements Renderer {

    private static final Logger log = Logger.getLogger(RasterRenderer.class.getName());

    @Override
    public void renderCircle(float radius) {
        log.info("Raster renderer: rendering circle with radius: " + radius);
    }
}
