package pl.slemjet.prototype.excrecise.e1;

public class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x, y;
}

class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(Line line) {
        this(new Point(line.start.x, line.start.y), new Point(line.end.x, line.end.y));
    }

    public Line deepCopy() {
        // todo
        return new Line(this);
    }
}