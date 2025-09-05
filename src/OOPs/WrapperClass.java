package OOPs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        System.out.println("========== WRAPPER CLASSES DEMONSTRATION ==========\n");

        // 1. Byte Wrapper
        Byte byteObj = Byte.valueOf((byte) 10);
        byte byteVal = byteObj; // unboxing
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Unboxed byte: " + byteVal);
        System.out.println("Byte MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Byte MIN_VALUE: " + Byte.MIN_VALUE + "\n");

        // 2. Short Wrapper
        Short shortObj = Short.valueOf((short) 200);
        short shortVal = shortObj;
        System.out.println("Short Object: " + shortObj);
        System.out.println("Unboxed short: " + shortVal);
        System.out.println("Short MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Short MIN_VALUE: " + Short.MIN_VALUE + "\n");

        // 3. Integer Wrapper
        Integer intObj = Integer.valueOf(1234);
        int intVal = intObj;
        System.out.println("Integer Object: " + intObj);
        System.out.println("Unboxed int: " + intVal);
        System.out.println("parseInt(\"5678\"): " + Integer.parseInt("5678"));
        System.out.println("Integer.compare(10,20): " + Integer.compare(10, 20));
        System.out.println("Integer.toString(999): " + Integer.toString(999));
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE + "\n");

        // 4. Long Wrapper
        Long longObj = Long.valueOf(9876543210L);
        long longVal = longObj;
        System.out.println("Long Object: " + longObj);
        System.out.println("Unboxed long: " + longVal);
        System.out.println("parseLong(\"1234567\"): " + Long.parseLong("1234567"));
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE + "\n");

        // 5. Float Wrapper
        Float floatObj = Float.valueOf(12.34f);
        float floatVal = floatObj;
        System.out.println("Float Object: " + floatObj);
        System.out.println("Unboxed float: " + floatVal);
        System.out.println("parseFloat(\"45.67\"): " + Float.parseFloat("45.67"));
        System.out.println("Float.isNaN(0f/0f): " + Float.isNaN(0f/0f));
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE + "\n");

        // 6. Double Wrapper
        Double doubleObj = Double.valueOf(123.456);
        double doubleVal = doubleObj;
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Unboxed double: " + doubleVal);
        System.out.println("parseDouble(\"78.90\"): " + Double.parseDouble("78.90"));
        System.out.println("Double.isInfinite(1.0/0.0): " + Double.isInfinite(1.0/0.0));
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE + "\n");

        // 7. Character Wrapper
        Character charObj = Character.valueOf('A');
        char charVal = charObj;
        System.out.println("Character Object: " + charObj);
        System.out.println("Unboxed char: " + charVal);
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
        System.out.println("Character.isDigit('9'): " + Character.isDigit('9'));
        System.out.println("Character.toLowerCase('Z'): " + Character.toLowerCase('Z'));
        System.out.println("Character.toUpperCase('m'): " + Character.toUpperCase('m') + "\n");

        // 8. Boolean Wrapper
        Boolean boolObj = Boolean.valueOf(true);
        boolean boolVal = boolObj;
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Unboxed boolean: " + boolVal);
        System.out.println("Boolean.parseBoolean(\"true\"): " + Boolean.parseBoolean("true"));
        System.out.println("Boolean.valueOf(\"FALSE\"): " + Boolean.valueOf("FALSE"));
        System.out.println("Boolean.valueOf(\"random\"): " + Boolean.valueOf("random") + "\n");

        // 9. Using Wrappers in Collections (only objects allowed)

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);   // autoboxing
        numbers.add(20);
        numbers.add(30);
        int firstNumber = numbers.get(0); // unboxing
        System.out.println("ArrayList of Integers: " + numbers);
        System.out.println("First element (Unboxed): " + firstNumber + "\n");

        // 10. Default value difference
        Integer wrapperDefault = null;
        int primitiveDefault = 0;
        System.out.println("Primitive default (int): " + primitiveDefault);
        System.out.println("Wrapper default (Integer): " + wrapperDefault + "\n");

        System.out.println("========== END OF DEMO ==========");

    }
}
