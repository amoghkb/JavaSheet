package OOPs;

// Demonstrating all interface concepts in a single program

// 1. Normal interface with abstract methods and constants
interface Vehicle {
    // constant (public static final by default)
    int MAX_SPEED = 120;

    // abstract method
    void start();

    // default method (Java 8+)
    default void fuel() {
        helper(); // calls private method inside interface
        System.out.println("Default: Uses petrol/diesel/electric.");
    }

    // static method (Java 8+)
    static void serviceInfo() {
        logService(); // private static method
        System.out.println("Service required every 6 months.");
    }

    // private method (Java 9+)
    private void helper() {
        System.out.println("[Helper] Fuel system initialized.");
    }

    // private static method (Java 9+)
    private static void logService() {
        System.out.println("[Log] Service info requested.");
    }
}

// 2. Multiple inheritance using interfaces
interface MusicSystem {
    void playMusic();
}

// 3. Marker interface (empty interface, just a tag)
interface Marker {}

// 4. Functional interface (single abstract method)
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// Class implementing multiple interfaces
class Car implements Vehicle, MusicSystem, Marker {
    public void start() {
        System.out.println("Car starts with a push button.");
    }

    public void playMusic() {
        System.out.println("Car music system is playing.");
    }

    // overriding default method from Vehicle
    @Override
    public void fuel() {
        System.out.println("Car runs on petrol.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Normal usage
        Vehicle v = new Car();
        v.start();         // abstract method
        v.fuel();          // overridden default method
        Vehicle.serviceInfo(); // static method (called using interface name)

        // Multiple inheritance
        MusicSystem m = new Car();
        m.playMusic();

        // Marker interface usage
        Car c = new Car();
        if (c instanceof Marker) {
            System.out.println("Car object is marked with Marker interface.");
        }

        // Functional interface with lambda expression
        Greeting g = (name) -> System.out.println("Hello, " + name + "!");
        g.sayHello("Amogh");
    }
}

/*
==================== EXPLANATION ====================

1. Abstract Methods & Constants:
   - Interface can declare abstract methods (without body).
   - All variables in an interface are implicitly 'public static final'.
   - Example: MAX_SPEED in Vehicle.

2. Default Methods (Java 8+):
   - Declared using 'default' keyword.
   - Provide default behavior to implementing classes.
   - Can be overridden by implementing classes.
   - Example: fuel() in Vehicle.

3. Static Methods (Java 8+):
   - Declared using 'static' keyword.
   - Belong to the interface itself, not inherited by classes.
   - Called using InterfaceName.method().
   - Example: Vehicle.serviceInfo().

4. Private Methods (Java 9+):
   - Declared using 'private' keyword.
   - Used only inside interface to remove code duplication.
   - Not inherited by implementing classes.
   - Example: helper() and logService() in Vehicle.

5. Multiple Inheritance:
   - A class can implement multiple interfaces.
   - Example: Car implements Vehicle and MusicSystem.

6. Marker Interfaces:
   - Empty interfaces (no methods).
   - Used to tag classes with special metadata.
   - Example: Marker interface in program (Car is marked).

7. Functional Interfaces (Java 8+):
   - Interfaces with exactly one abstract method.
   - Used with Lambda expressions and Streams API.
   - Annotated with @FunctionalInterface.
   - Example: Greeting with lambda (sayHello).

8. Overriding Default Methods:
   - Classes can override default methods to provide specific implementation.
   - Example: Car overrides fuel().

====================================================
In short:
- Interface = Contract (what to do).
- Implementing class = How to do.
- With Java 8 and 9, interfaces became powerful (default, static, private methods).
- They allow abstraction, multiple inheritance, marker tagging, and functional programming.
====================================================
*/
