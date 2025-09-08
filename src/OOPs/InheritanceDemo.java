/*
package OOPs; // InheritanceConcepts.java
// A single program showing all types & concepts of Inheritance in Java
// Using different examples (Company, Devices, Gadgets, etc.)

// 1) Base class (Super class)
class Employee {
    String role = "Generic Employee";

    Employee() {
        System.out.println("Employee Constructor called");
    }

    void work() {
        System.out.println(role + " works 9 to 5");
    }

    void takeBreak() {
        System.out.println(role + " takes a short break");
    }
}

// 2) Single Inheritance: Manager extends Employee
class Manager extends EEmployee {
    String department = "Sales";

    Manager() {
        super(); // calls Employee constructor
        role = "Manager"; // overriding parent field value
        System.out.println("Manager Constructor called");
    }

    // Method Overriding
    @Override
    void work() {
        super.work(); // call parent method
        System.out.println("Manager manages the " + department + " department");
    }

    void approveLeave() {
        System.out.println("Manager approves leave requests");
    }
}

// 3) Multilevel Inheritance: TeamLead extends Manager -> Manager extends Employee
class TeamLead extends Manager {
    TeamLead() {
        super(); // calls Manager constructor (which calls Employee constructor)
        role = "Team Lead";
        System.out.println("TeamLead Constructor called");
    }

    void assignTask() {
        System.out.println("Team Lead assigns tasks to team members");
    }
}

// 4) Hierarchical Inheritance: Developer also extends Employee
class Developer extends EEmployee {
    Developer() {
        super();
        role = "Developer";
        System.out.println("Developer Constructor called");
    }

    @Override
    void work() {
        System.out.println("Developer writes code and fixes bugs");
    }

    void debugCode() {
        System.out.println("Developer debugs the application");
    }
}

// 5) Abstract Class Inheritance
abstract class Device {
    abstract void powerOn(); // abstract method (must be implemented)

    void charge() {
        System.out.println("Device is charging...");
    }
}

// Concrete class Laptop extends abstract class Device
class Laptop extends Device {
    @Override
    void powerOn() {
        System.out.println("Laptop powers on with the power button");
    }
}

// 6) Interface Inheritance (Multiple Inheritance using interfaces)
interface Connectable {
    void connect();
}
interface Rechargeable {
    void recharge();
}

// Smartphone implements multiple interfaces
class Smartphone extends Device implements Connectable, Rechargeable {
    Smartphone() {}

    @Override
    void powerOn() {
        System.out.println("Smartphone powers on with a tap");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone connects to WiFi and Bluetooth");
    }

    @Override
    public void recharge() {
        System.out.println("Smartphone recharges using a USB-C cable");
    }
}

// 7) Final keyword
final class FinalUtility {
    void display() {
        System.out.println("This is a final utility class. It cannot be inherited.");
    }
}

*/
/*
class ExtendedUtility extends FinalUtility { } // ❌ ERROR: cannot inherit final class
*//*


class BaseWithFinalMethod {
    final void showPolicy() {
        System.out.println("This policy method cannot be overridden");
    }
}
class DerivedFinalMethod extends BaseWithFinalMethod {
    // void showPolicy() { } // ❌ ERROR: cannot override final method
}

// 8) Every class implicitly extends Object
class Report extends Object {
    String title = "Quarterly Report";

    @Override
    public String toString() {
        return "Report: " + title;
    }
}

// Main class to demonstrate everything
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Manager manager = new Manager();
        manager.work();     // overridden + parent method
        manager.takeBreak(); // inherited
        manager.approveLeave(); // own method

        System.out.println("\n=== Multilevel Inheritance ===");
        TeamLead lead = new TeamLead();
        lead.work();       // inherited + overridden
        lead.assignTask();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Developer dev = new Developer();
        dev.work();   // Developer’s overridden version
        dev.debugCode();

        System.out.println("\n=== Abstract Class Inheritance ===");
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.charge();

        System.out.println("\n=== Multiple Inheritance using Interfaces ===");
        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.connect();
        phone.recharge();
        phone.charge();  // inherited concrete method from Device

        System.out.println("\n=== Final Keyword Demo ===");
        FinalUtility util = new FinalUtility();
        util.display();
        DerivedFinalMethod dfm = new DerivedFinalMethod();
        dfm.showPolicy();

        System.out.println("\n=== Object Class Inheritance ===");
        Report report = new Report();
        System.out.println(report.toString()); // inherited from Object
        System.out.println("HashCode from Object class: " + report.hashCode());
    }
}

*/
/*
================== EXPLANATION OF INHERITANCE TYPES ==================

1) Single Inheritance:
   - A child class inherits from only one parent.
   - Example: Manager extends Employee.
   - Manager gets Employee's methods + adds/overrides its own.

2) Multilevel Inheritance:
   - A chain of inheritance.
   - Example: TeamLead -> Manager -> Employee.
   - TeamLead indirectly inherits Employee.

3) Hierarchical Inheritance:
   - Multiple child classes inherit from one parent.
   - Example: Manager and Developer both extend Employee.

4) Abstract Class Inheritance:
   - Abstract classes cannot be instantiated.
   - They may have abstract methods (no body).
   - Child must implement abstract methods.
   - Example: Device (abstract) -> Laptop (concrete).

5) Multiple Inheritance with Interfaces:
   - Java does not allow multiple inheritance with classes.
   - But a class can implement multiple interfaces.
   - Example: Smartphone implements Connectable + Rechargeable.

6) Final Keyword:
   - final class → cannot be extended.
   - final method → cannot be overridden.
   - Example: FinalUtility is a final class, BaseWithFinalMethod has a final method.

7) Object Class:
   - Every class in Java implicitly extends Object.
   - Provides default methods: toString(), hashCode(), equals(), etc.
   - Example: Report overrides toString().

================= SUMMARY =================
- Inheritance = "IS-A" relationship.
- Helps in code reusability & polymorphism.
- Types in Java: Single, Multilevel, Hierarchical.
- Multiple inheritance of classes is not allowed (to avoid ambiguity), but allowed via interfaces.
- Abstract classes & interfaces provide abstraction.
- Final prevents further inheritance/overriding.
- Object is the root parent of all classes in Java.

====================================================
*/

