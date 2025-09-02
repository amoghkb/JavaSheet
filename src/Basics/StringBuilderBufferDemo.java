package Basics;

class StringBuilderBufferDemo {
    public static void main(String[] args) {

        // -------------------- StringBuilder --------------------
        System.out.println("===== StringBuilder Demo =====");
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() → add text at the end
        sb.append(" World");
        System.out.println("append: " + sb); // Hello World

        // 2. insert() → insert text at index
        sb.insert(6, "Java ");
        System.out.println("insert: " + sb); // Hello Java World

        // 3. replace() → replace characters from index to index
        sb.replace(6, 10, "C++");
        System.out.println("replace: " + sb); // Hello C++ World

        // 4. delete() → remove characters from index to index
        sb.delete(6, 10);
        System.out.println("delete: " + sb); // Hello World

        // 5. reverse() → reverse the string
        sb.reverse();
        System.out.println("reverse: " + sb); // dlroW olleH
        sb.reverse(); // reverse back for further operations

        // 6. length() → number of characters
        System.out.println("length: " + sb.length()); // 11

        // 7. capacity() → current storage capacity
        System.out.println("capacity: " + sb.capacity()); // default 16 + "Hello World".length()

        // 8. ensureCapacity() → increase buffer size if needed
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + sb.capacity());

        // 9. charAt() → get character at index
        System.out.println("charAt(1): " + sb.charAt(1)); // e

        // 10. setCharAt() → change character at index
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb); // hello World

        // 11. substring() → extract portion
        System.out.println("substring(0, 5): " + sb.substring(0, 5)); // hello


        // -------------------- StringBuffer --------------------
        System.out.println("\n===== StringBuffer Demo =====");
        StringBuffer sbuf = new StringBuffer("Hello");

        sbuf.append(" World");
        System.out.println("append: " + sbuf); // Hello World

        sbuf.insert(6, "Java ");
        System.out.println("insert: " + sbuf); // Hello Java World

        sbuf.replace(6, 10, "C++");
        System.out.println("replace: " + sbuf); // Hello C++ World

        sbuf.delete(6, 10);
        System.out.println("delete: " + sbuf); // Hello World

        sbuf.reverse();
        System.out.println("reverse: " + sbuf); // dlroW olleH
        sbuf.reverse();

        System.out.println("length: " + sbuf.length()); // 11
        System.out.println("capacity: " + sbuf.capacity());

        sbuf.ensureCapacity(40);
        System.out.println("ensureCapacity(40): " + sbuf.capacity());

        System.out.println("charAt(1): " + sbuf.charAt(1));
        sbuf.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sbuf);

        System.out.println("substring(0, 5): " + sbuf.substring(0, 5));
    }
}

