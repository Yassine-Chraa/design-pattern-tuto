
public class Client {
    public static void main(String[] args) {

        Phone originalPhone = new Phone("Samsung", "Galaxy S21");

        // Cloning the original phone to create a new phone
        Phone clonedPhone = originalPhone.clone();

        // Modifying the cloned phone
        clonedPhone.setModel("iPhone 13");

        System.out.println("Original Phone: " + originalPhone.describe());
        System.out.println("Cloned Phone: " + clonedPhone.describe());
    }
}


interface PhonePrototype {
    PhonePrototype clone();
    String describe();
}

// Concrete Prototype
class Phone implements PhonePrototype {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String describe() {
        return "Phone: " + brand + " " + model;
    }

    public Phone clone() {
        return new Phone(brand, model);
    }
}
