package shape;

public class Triangle extends Shape {
    public Triangle(int length, int height, int width) {
        super(length, height, width);
    }

    @Override
    public void Square() {
        double S = 0.5*(getHeight()*getLength());
        setSquare(S);
    }

    @Override
    public String toString() {
        return "Triangle { " +
                "length = " + getLength() +
                " , height = " + getHeight() +
                " , width = " + getWidth() +
                " }";
    }
}
