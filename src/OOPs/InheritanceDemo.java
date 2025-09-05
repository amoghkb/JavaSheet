package OOPs;// InheritanceDemo.java
// A single program showing all types & concepts of Inheritance in Java

// 1) Base class (Super class)
class Animal {
    String name = "Generic Animal";

    Animal() {
        System.out.println("Animal Constructor called");
    }

    void eat() {
        System.out.println(name + " eats food");
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }
}

// 2) Single Inheritance: Dog extends Animal
class Dog extends Animal {
    String breed = "Labrador";

    Dog() {
        super(); // calls Animal() constructor
        name = "Dog"; // overriding parent field value
        System.out.println("Dog Constructor called");
    }

    // Method Overriding
    @Override
    void eat() {
        super.eat(); // call parent class method
        System.out.println("Dog eats bones");
    }

    void bark() {
        System.out.println("Dog barks!");
    }
}

// 3) Multilevel Inheritance: Puppy extends Dog -> Dog extends Animal
class Puppy extends Dog {
    Puppy() {
        super(); // calls Dog constructor (which calls Animal constructor)
        name = "Puppy";
        System.out.println("Puppy Constructor called");
    }

    void play() {
        System.out.println("Puppy loves to play!");
    }
}

// 4) Hierarchical Inheritance: Cat also extends Animal
class Cat extends Animal {
    Cat() {
        super();
        name = "Cat";
        System.out.println("Cat Constructor called");
    }

    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }

    void meow() {
        System.out.println("Cat meows!");
    }
}

// 5) Abstract Class Inheritance
abstract class Vehicle {
    abstract void start(); // abstract method (must be implemented by child class)

    void fuel() {
        System.out.println("Vehicles need fuel");
    }
}

// Concrete class Car extends abstract class Vehicle
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

// 6) Interface Inheritance (Multiple Inheritance using interfaces)
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}

// Bird implements multiple interfaces
class Bird extends Animal implements Flyable, Swimmable {
    Bird() {
        name = "Bird";
    }

    @Override
    public void fly() {
        System.out.println("Bird flies in the sky");
    }

    @Override
    public void swim() {
        System.out.println("Bird swims in water");
    }
}

// 7) Final keyword
final class FinalClass {
    void display() {
        System.out.println("This is a final class. It cannot be inherited.");
    }
}

/*
class ChildOfFinal extends FinalClass { } // ❌ ERROR: cannot inherit from final class
*/

class ParentWithFinalMethod {
    final void cannotOverride() {
        System.out.println("This final method cannot be overridden");
    }
}
class ChildFinalMethod extends ParentWithFinalMethod {
    // void cannotOverride() { } // ❌ ERROR: cannot override final method
}

// 8) Every class implicitly extends Object
class Example extends Object {
    int value = 10;
    @Override
    public String toString() {
        return "Example class with value = " + value;
    }
}

// Main class to demonstrate everything
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Dog dog = new Dog();
        dog.eat(); // overridden + parent method
        dog.sleep(); // inherited
        dog.bark(); // own method

        System.out.println("\n=== Multilevel Inheritance ===");
        Puppy puppy = new Puppy();
        puppy.eat();  // inherited + overridden
        puppy.play();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Cat cat = new Cat();
        cat.eat();   // Cat’s overridden version
        cat.meow();

        System.out.println("\n=== Abstract Class Inheritance ===");
        Car car = new Car();
        car.start();
        car.fuel();

        System.out.println("\n=== Multiple Inheritance using Interfaces ===");
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
        bird.eat();  // inherited from Animal

        System.out.println("\n=== Final Keyword Demo ===");
        FinalClass finalObj = new FinalClass();
        finalObj.display();
        ChildFinalMethod childFinal = new ChildFinalMethod();
        childFinal.cannotOverride();

        System.out.println("\n=== Object Class Inheritance ===");
        Example ex = new Example();
        System.out.println(ex.toString()); // inherited from Object
        System.out.println("HashCode from Object class: " + ex.hashCode());
    }
}
