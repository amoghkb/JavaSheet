package OOPs;

// A single program showing all concepts of Encapsulation in Java

// 1) A fully encapsulated class (all fields private, getters & setters provided)
class BankAccount {
    // private fields (data hiding)
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // public getter and setter methods (controlled access)
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return "****" + accountNumber.substring(accountNumber.length() - 4); // masking for security
    }

    public double getBalance() {
        return balance;
    }

    // no setter for balance → protects balance from direct modification
    // instead, provide controlled methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance = " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance = " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }
}

// 2) Encapsulation with read-only fields (only getter)
class Student {
    private final String rollNumber; // final → cannot change once set
    private String name;

    Student(String rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber; // no setter → read-only
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // writable
    }
}

// 3) Encapsulation with write-only field (only setter)
class SecureData {
    private String password;

    // write-only field (cannot read password back)
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password has been set securely.");
    }
}

// 4) Encapsulation + validation logic
class EEmployee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Cannot be empty.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 18.");
        }
    }
}

// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=== Fully Encapsulated BankAccount ===");
        BankAccount acc = new BankAccount("Alice", "1234567890", 1000);
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("\n=== Read-only and Write-only Fields ===");
        Student student = new Student("22CS001", "Bob");
        System.out.println("Roll Number (read-only): " + student.getRollNumber());
        student.setName("Robert");
        System.out.println("Updated Name: " + student.getName());

        SecureData data = new SecureData();
        data.setPassword("myStrongPassword123"); // write-only

        System.out.println("\n=== Encapsulation with Validation ===");
        EEmployee emp = new EEmployee();
        emp.setName("Charlie");
        emp.setAge(25);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());

        emp.setAge(15); // invalid
        emp.setName(""); // invalid
    }
}

/*
================= EXPLANATION OF ENCAPSULATION =================

1) Definition:
   - Encapsulation = Wrapping data (fields) and behavior (methods) into a single unit (class).
   - Also known as "Data Hiding".
   - Achieved by making fields private and exposing public getter/setter methods.

---------------------------------------------------
2) Key Concepts:
   - private → restricts direct access to fields.
   - getters → provide controlled read access.
   - setters → provide controlled write access (with validation).
   - Can make fields:
       - Read-Only → only getter (e.g., Student.rollNumber).
       - Write-Only → only setter (e.g., SecureData.password).
       - Read/Write → getter + setter (e.g., Employee.name).

---------------------------------------------------
3) Advantages:
   - Data Hiding: prevents unauthorized access to internal details.
   - Security: sensitive data (like passwords, balances) is protected.
   - Validation: setters can include rules (e.g., age > 18).
   - Flexibility: internal implementation can change without affecting external code.
   - Maintainability: cleaner, modular code.

---------------------------------------------------
4) Examples in Java Libraries:
   - JavaBeans convention: private fields + public getters/setters.
   - Classes like java.util.Date, java.io.File use encapsulation heavily.

---------------------------------------------------
5) Difference from Abstraction:
   - Abstraction → Hides *implementation details* (focus on WHAT, not HOW).
   - Encapsulation → Hides *data* (restricts direct access, provides controlled access).

---------------------------------------------------
6) Summary:
   - Encapsulation = private fields + getters & setters.
   - Provides security, maintainability, flexibility.
   - A core OOP principle used in almost every real-world Java program.

====================================================
*/
