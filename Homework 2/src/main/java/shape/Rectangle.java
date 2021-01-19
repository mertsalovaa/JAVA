package shape;

public class Rectangle extends Shape {

    public Rectangle(int length, int height, int width) {
        super(length, height, width);
    }

    public void Square() {
        double S = getLength()*getWidth();
        setSquare(S);
    }
}
