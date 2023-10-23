// 1. Product Interface
interface Product {
    void create();
}

// 2. Concrete Products
class ConcreteProductA implements Product {
    @Override
    public void create() {
        // Implementation specific to ConcreteProductA
    }
}

class ConcreteProductB implements Product {
    @Override
    public void create() {
        // Implementation specific to ConcreteProductB
    }
}

// 3. Creator Interface
interface Creator {
    Product factoryMethod();
    // Additional methods can be added here
}

// 4. Concrete Creators
class ConcreteCreatorA implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
    // Additional methods can be implemented here
}

class ConcreteCreatorB implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
    // Additional methods can be implemented here
}
