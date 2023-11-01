public class Singleton {
    public static void main(String[] args) {
        CustomClass obj1 = CustomClass.getInstance();
        // Récupération de la même instance
        CustomClass obj2 = CustomClass.getInstance();
    }
}

// Singleton Class
public class CustomClass {
    private static CustomClass instance;

    private CustomClass() {
    }

    public static CustomClass getInstance() {
        if (instance == null) {
            instance = new CustomClass();
        }
        return instance; 
    }
}