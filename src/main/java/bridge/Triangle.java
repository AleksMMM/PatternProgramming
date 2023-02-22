package bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("треугольник");
        color.fillColor();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + color +
                '}';
    }
}
