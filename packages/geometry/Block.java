package geometry;
import shapes.Rectangle;

public class Block implements Geometry {
    private Rectangle baseShape;
    private double height;

    public Block(Rectangle baseShape, double height) {
        this.baseShape = baseShape;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return baseShape.calculateArea() * height; // Volume = area of base shape * height
    }

    @Override
    public double calculateBaseArea() {
        return baseShape.calculateArea();
    }
}
