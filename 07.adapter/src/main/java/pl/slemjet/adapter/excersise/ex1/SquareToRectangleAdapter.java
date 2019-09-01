package pl.slemjet.adapter.excersise.ex1;

public class SquareToRectangleAdapter implements Rectangle{
    private int width;
    private int height;

    public SquareToRectangleAdapter(Square square) {
        width = height = square.side;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}


class Square {
    public int side;

    public Square(int side) {
        this.side = side;
    }
}

interface Rectangle {
    int getWidth();

    int getHeight();

    default int getArea() {
        return getWidth() * getHeight();
    }
}
