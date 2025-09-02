package Basics;

import java.util.Scanner;

public class ParsingAndConversionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. String to Primitive Types ---
        System.out.println("--- Parsing Strings to Primitives ---");
        String intStr = "100";
        String doubleStr = "123.45";
        String booleanStr = "true";
        String charStr = "A";

        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean booleanValue = Boolean.parseBoolean(booleanStr);
        char charValue = charStr.charAt(0); // String to char

        System.out.println("Parsed int: " + intValue);
        System.out.println("Parsed double: " + doubleValue);
        System.out.println("Parsed boolean: " + booleanValue);
        System.out.println("Parsed char: " + charValue);

        // --- 2. Primitives to String ---
        System.out.println("\n--- Converting Primitives to Strings ---");
        String intToStr = Integer.toString(intValue);
        String doubleToStr = Double.toString(doubleValue);
        String booleanToStr = Boolean.toString(booleanValue);
        String charToStr = Character.toString(charValue);

        System.out.println("int to String: " + intToStr);
        System.out.println("double to String: " + doubleToStr);
        System.out.println("boolean to String: " + booleanToStr);
        System.out.println("char to String: " + charToStr);

        // --- 3. Using valueOf() ---
        System.out.println("\n--- Using valueOf() ---");
        Integer intObj = Integer.valueOf("200");
        Double doubleObj = Double.valueOf("456.78");
        Boolean boolObj = Boolean.valueOf("false");

        System.out.println("Integer.valueOf(): " + intObj);
        System.out.println("Double.valueOf(): " + doubleObj);
        System.out.println("Boolean.valueOf(): " + boolObj);

        // --- 4. String.valueOf() with primitives ---
        System.out.println("\n--- Using String.valueOf() ---");
        System.out.println("String.valueOf(int): " + String.valueOf(123));
        System.out.println("String.valueOf(double): " + String.valueOf(98.76));
        System.out.println("String.valueOf(char): " + String.valueOf('Z'));
        System.out.println("String.valueOf(boolean): " + String.valueOf(true));

        // --- 5. Converting between number types ---
        System.out.println("\n--- Converting Between Numeric Types ---");
        int i = 150;
        double d = i; // Implicit widening
        float f = (float) d; // Explicit narrowing
        long l = (long) f;

        System.out.println("int to double: " + d);
        System.out.println("double to float: " + f);
        System.out.println("float to long: " + l);

        // --- 6. Autoboxing and Unboxing ---
        System.out.println("\n--- Autoboxing and Unboxing ---");
        Integer boxedInt = i; // Autoboxing
        int unboxedInt = boxedInt; // Unboxing
        System.out.println("Autoboxed Integer: " + boxedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // --- 7. Character and ASCII conversions ---
        System.out.println("\n--- Character and ASCII Conversion ---");
        char letter = 'B';
        int ascii = (int) letter;
        char fromAscii = (char) ascii;

        System.out.println("Character: " + letter);
        System.out.println("ASCII value of 'B': " + ascii);
        System.out.println("Char from ASCII " + ascii + ": " + fromAscii);

        // --- 8. Reading and converting user input ---
        System.out.println("\n--- User Input Conversion Example ---");
        System.out.print("Enter a number (as string): ");
        String userInput = scanner.next();
        int parsedInput = Integer.parseInt(userInput);
        System.out.println("You entered the integer: " + parsedInput);

        scanner.close();
    }
}
