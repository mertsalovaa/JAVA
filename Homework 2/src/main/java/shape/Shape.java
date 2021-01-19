package shape;

public abstract class Shape {
    private int length;
    private int height;
    private int width;
    private double Square;

    public Shape(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getSquare() {
        return Square;
    }

    public void setSquare(double square) {
        Square = square;
    }

    public abstract void Square();
}
