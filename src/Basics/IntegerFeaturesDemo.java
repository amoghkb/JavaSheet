package Basics;

public class IntegerFeaturesDemo {
    public static void main(String[] args) {

        // 1. Primitive int and Wrapper class Integer
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(10); // Explicit boxing
        Integer autoBoxedInt = 20; // Auto-boxing

        // 2. Unboxing
        int unboxedInt = wrapperInt; // Auto-unboxing

        // 3. Constants
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.SIZE (bits): " + Integer.SIZE);
        System.out.println("Integer.BYTES: " + Integer.BYTES);
        System.out.println("Integer.TYPE (primitive class): " + Integer.TYPE);

        // 4. parseInt() - converts String to int
        int parsedInt = Integer.parseInt("123");
        System.out.println("Parsed using parseInt(): " + parsedInt);

        // 5. valueOf() - returns Integer object (caching used for values between -128 to 127)
            Integer valueOfInt = Integer.valueOf("123");
        System.out.println("Parsed using valueOf(): " + valueOfInt);

        // 6. toString() - converts int/Integer to String
        String intAsString = Integer.toString(456);
        System.out.println("Integer to String: " + intAsString);

        // 7. toBinaryString(), toHexString(), toOctalString()
        System.out.println("Binary: " + Integer.toBinaryString(10));
        System.out.println("Hexadecimal: " + Integer.toHexString(10));
        System.out.println("Octal: " + Integer.toOctalString(10));

        // 8. compare() and compareTo()
        System.out.println("Compare (10, 20): " + Integer.compare(10, 20));  // -1
        System.out.println("compareTo (wrapper): " + wrapperInt.compareTo(autoBoxedInt)); // -1

        // 9. equals()
        Integer intA = 100;
        Integer intB = 100;
        Integer intC = 200;
        Integer intD = 200;
        System.out.println("intA == intB: " + (intA == intB)); // true (cached)
        System.out.println("intC == intD: " + (intC == intD)); // false (outside cache range)
        System.out.println("intC.equals(intD): " + intC.equals(intD)); // true

        // 10. hashCode()
        System.out.println("HashCode of 123: " + Integer.valueOf(123).hashCode());

        // 11. reverse(), reverseBytes(), rotateLeft(), rotateRight()
        int num = 0b00000010;
        System.out.println("Reverse bits of 2: " + Integer.reverse(num));
        System.out.println("Reverse bytes of 2: " + Integer.reverseBytes(num));
        System.out.println("Rotate left (2 by 1): " + Integer.rotateLeft(num, 1));
        System.out.println("Rotate right (2 by 1): " + Integer.rotateRight(num, 1));

        // 12. Highest/Lowest one bit
        int example = 18; // 10010
        System.out.println("Highest one bit: " + Integer.highestOneBit(example)); // 16
        System.out.println("Lowest one bit: " + Integer.lowestOneBit(example)); // 2

        // 13. bitCount()
        System.out.println("Number of 1 bits in 18: " + Integer.bitCount(example));

        // 14. numberOfLeadingZeros(), numberOfTrailingZeros()
        System.out.println("Leading zeros in 18: " + Integer.numberOfLeadingZeros(example));
        System.out.println("Trailing zeros in 18: " + Integer.numberOfTrailingZeros(example));

        // 15. sum(), max(), min()
        System.out.println("Sum: " + Integer.sum(5, 10));
        System.out.println("Max: " + Integer.max(5, 10));
        System.out.println("Min: " + Integer.min(5, 10));

        // 16. decode() - parses string with radix prefixes: 0x, 0, #
        System.out.println("Decode '0xFF': " + Integer.decode("0xFF")); // 255
        System.out.println("Decode '077': " + Integer.decode("077")); // 63 (octal)
        System.out.println("Decode '#100': " + Integer.decode("#100")); // 256
    }
}
