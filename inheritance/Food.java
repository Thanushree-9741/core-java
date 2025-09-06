package Package.inheritance;

public class Food {

    String name;

    Food(String name) {
        this.name = name;
    }


    void display() {
        System.out.println("Food name: " + name);
    }


    final void finalMethod() {
        System.out.println("This is a final method in Food.");
    }

    static void staticMethod() {
        System.out.println("This is a static method in Food.");
    }


    void info(String type) {
        System.out.println("Food type: " + type);
    }

    void info(int calories) {
        System.out.println("Calories: " + calories);
    }


    void finalMethod(String msg) {
        System.out.println("Overloaded final method: " + msg);
    }


    static void staticMethod(int version) {
        System.out.println("Overloaded static method, version: " + version);
    }
}

