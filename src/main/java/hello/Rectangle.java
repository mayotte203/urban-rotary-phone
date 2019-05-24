package hello;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public int getSquare()
    {
        return width * height;
    }
    public int getPerimeter() {
        return 2 * (width + height);
    }
}
