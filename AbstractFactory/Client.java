
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA1.operationA();
        productB1.operationB();
        productA2.operationA();
        productB2.operationB();
    }
}

// Abstract Factory Interface
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// Concrete Factories
class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Abstract Products
interface ProductA {
    void operationA();
}

interface ProductB {
    void operationB();
}

// Concrete Products
class ConcreteProductA1 implements ProductA {
    public void operationA() {
        System.out.println("Product A1 operation");
    }
}

class ConcreteProductB1 implements ProductB {
    public void operationB() {
        System.out.println("Product B1 operation");
    }
}

class ConcreteProductA2 implements ProductA {
    public void operationA() {
        System.out.println("Product A2 operation");
    }
}

class ConcreteProductB2 implements ProductB {
    public void operationB() {
        System.out.println("Product B2 operation");
    }
}


