package pl.slemjet.adapter.cached;

import org.junit.jupiter.api.Test;
import pl.slemjet.adapter.cached.model.Line;
import pl.slemjet.adapter.cached.model.Point;
import pl.slemjet.adapter.cached.model.VectorObject;
import pl.slemjet.adapter.cached.model.VectorRectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineToPointAdapterTest {
    private static final List<VectorObject> vectorObjects =
            new ArrayList<>(Arrays.asList(
                    new VectorRectangle(1, 1, 10, 10),
                    new VectorRectangle(3, 3, 6, 6)
            ));

    @Test
    public void test(){
        draw();
        draw();
        assertTrue(true);
    }

    public static void drawPoint(Point p) {
        System.out.print(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(point -> drawPoint(point));
            }
        }
    }
}