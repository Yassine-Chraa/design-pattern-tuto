public class FactoryMethod {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Circle instance
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        // Square instance
        Shape square = shapeFactory.createShape("SQUARE");
        square.draw();
    }
}

// Interface Product
public interface Shape {
    void draw();
}

// ProductA
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

// ProductB
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

// Factory Inteface
public interface Factory {
    Shape createShape(String shapeType);
}

// Factory
public class ShapeFactory implements Factory {

    // Factory Method
    @Override
    public Shape createShape(String shapeType) {
        switch(shapeType){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
