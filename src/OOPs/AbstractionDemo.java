package OOPs;


// 1) Abstract class (cannot be instantiated)
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor called: " + color);
    }

    // abstract method (must be implemented by subclasses)
    abstract double area();

    // concrete method
    void displayColor() {
        System.out.println("Shape color is " + color);
    }
}

// 2) Concrete subclass implementing abstract methods
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// 3) Interface (pure abstraction)
interface Machine {
    // Constant (public static final by default)
    int VERSION = 1;

    // Abstract method
    void start();

    // Default method (Java 8+)
    default void stop() {
        helper();
        System.out.println("Default: Machine stopped.");
    }

    // Static method (Java 8+)
    static void info() {
        log();
        System.out.println("Machine interface version " + VERSION);
    }

    // Private method (Java 9+)
    private void helper() {
        System.out.println("[Helper] Cleaning up before stopping...");
    }

    // Private static method (Java 9+)
    private static void log() {
        System.out.println("[Log] Machine info accessed.");
    }
}

// 4) Concrete class implementing interface
class Printer implements Machine {
    @Override
    public void start() {
        System.out.println("Printer starts printing...");
    }

    // overriding default method
    @Override
    public void stop() {
        System.out.println("Printer stops after finishing all jobs.");
    }
}

// 5) Multiple inheritance using interfaces
interface Scanner {
    void scan();
}

class MultiFunctionPrinter implements Machine, Scanner {
    @Override
    public void start() {
        System.out.println("MultiFunctionPrinter starts.");
    }

    @Override
    public void scan() {
        System.out.println("MultiFunctionPrinter scans a document.");
    }
}

// 6) Marker interface (empty interface for tagging)
interface Serializable {}

// 7) Functional interface (exactly one abstract method)
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Demo ===");
        Shape circle = new Circle("Red", 5);
        System.out.println("Circle area = " + circle.area());
        circle.displayColor();

        Shape rect = new Rectangle("Blue", 4, 6);
        System.out.println("Rectangle area = " + rect.area());
        rect.displayColor();

        System.out.println("\n=== Interface Demo ===");
        Printer printer = new Printer();
        printer.start();
        printer.stop();
        Machine.info(); // static method

        System.out.println("\n=== Multiple Inheritance using Interfaces ===");
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.start();
        mfp.scan();
        mfp.stop();

        System.out.println("\n=== Marker Interface Demo ===");
        if (printer instanceof Serializable) {
            System.out.println("Printer is serializable.");
        } else {
            System.out.println("Printer is NOT serializable.");
        }

        System.out.println("\n=== Functional Interface with Lambda ===");
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Addition = " + add.compute(5, 3));
        System.out.println("Multiplication = " + multiply.compute(5, 3));
    }
}

/*
================= EXPLANATION OF ABSTRACTION =================

1) Abstraction:
   - Process of hiding implementation details and showing only functionality.
   - Achieved in Java using Abstract Classes & Interfaces.

---------------------------------------------------
2) Abstract Classes:
   - Declared with 'abstract' keyword.
   - Can have abstract methods (without body) and concrete methods (with body).
   - Cannot be instantiated directly.
   - Example: Shape is abstract, Circle & Rectangle implement area().
   - Used when classes share common behavior but also require specific implementations.

---------------------------------------------------
3) Interfaces:
   - 100% abstraction (before Java 8).
   - Can only have:
       - abstract methods (implicitly public & abstract)
       - constants (implicitly public static final)
   - From Java 8 → default & static methods allowed.
   - From Java 9 → private methods allowed.
   - Example: Machine interface.

   Methods in Interfaces:
   - abstract → must be implemented by child (start()).
   - default → has a body, can be overridden (stop()).
   - static → belongs to interface, called with InterfaceName.method() (info()).
   - private → helper methods for code reuse inside interface (helper(), log()).

---------------------------------------------------
4) Multiple Inheritance via Interfaces:
   - A class can implement multiple interfaces (unlike classes).
   - Example: MultiFunctionPrinter implements Machine + Scanner.

---------------------------------------------------
5) Marker Interfaces:
   - Empty interfaces used for tagging metadata.
   - Example: java.io.Serializable, Cloneable.
   - Example: Serializable in program.

---------------------------------------------------
6) Functional Interfaces:
   - Have exactly one abstract method.
   - Used with Lambda expressions and functional programming.
   - Annotated with @FunctionalInterface.
   - Example: Calculator with lambda (add, multiply).

---------------------------------------------------
7) Differences:
   - Abstract Class:
       - Can have fields, constructors, abstract & concrete methods.
       - "IS-A" relationship.
       - Single inheritance only.
   - Interface:
       - Supports multiple inheritance.
       - Cannot have constructors.
       - Used for "Contract" (what to do), while implementation defines "How to do".

---------------------------------------------------
8) Summary:
   - Abstraction = focus on "what" not "how".
   - Abstract classes: partial abstraction + code reuse.
   - Interfaces: pure abstraction + multiple inheritance + contracts.
   - Java (from 8+) made interfaces more powerful (default, static, private methods).
   - Widely used in design patterns, APIs, and frameworks.

====================================================
*/

