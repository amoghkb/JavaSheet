package OOPs;

// Polymorphism Demo Program
class Animal {
    // Method Overloading (Compile-time Polymorphism)
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String mood) {
        System.out.println("Animal makes a sound when it is " + mood);
    }

    // Method to be overridden (Runtime Polymorphism)
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    // Overriding eat() (Runtime Polymorphism)
    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }

    // Covariant return type example
    @Override
    Dog reproduce() {
        System.out.println("Dog reproduces - returns Dog object");
        return this;
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    Cat reproduce() {
        System.out.println("Cat reproduces - returns Cat object");
        return this;
    }
}

// Interface example
interface Pet {
    void play();
}

// Dog implements Pet interface
class PetDog extends Dog implements Pet {
    @Override
    public void play() {
        System.out.println("Pet Dog plays with owner");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // ---------- Compile-time Polymorphism ----------
        Animal a1 = new Animal();
        a1.sound(); // Calls sound()
        a1.sound("angry"); // Calls overloaded sound(String)

        // ---------- Runtime Polymorphism ----------
        Animal a2 = new Dog(); // Upcasting (Animal reference, Dog object)
        a2.eat(); // Calls Dog's eat() due to dynamic method dispatch

        Animal a3 = new Cat(); // Upcasting
        a3.eat(); // Calls Cat's eat()

        // ---------- Covariant return types ----------
        Dog d = new Dog();
        d.reproduce(); // returns Dog

        Cat c = new Cat();
        c.reproduce(); // returns Cat

        // ---------- Interface Polymorphism ----------
        Pet myPet = new PetDog(); // Pet reference, PetDog object
        myPet.play(); // Calls PetDog's play()

        // ---------- Using super and this ----------
        // In real polymorphism, 'super' is used to call parent methods inside child
        // 'this' refers to current object
        System.out.println("\n--- super & this explained inside classes ---");
    }
}
