package Basics;

import java.util.Locale;

class AllStringBuiltinsDemo {
    public static void main(String[] args) {
        String str = "Hello World";

        // 1. Creation
        String literal = "Java";
        String object = new String("Java");
        System.out.println("Literal == Object: " + (literal == object));
        System.out.println("Literal.equals(Object): " + literal.equals(object));

        // 2. Length & charAt
        System.out.println("Length: " + str.length());
        System.out.println("charAt(4): " + str.charAt(4));

        // 3. substring
        System.out.println("substring(0, 5): " + str.substring(0, 5));

        // 4. concat
        System.out.println("concat: " + str.concat(" Rocks"));

        // 5. contains, startsWith, endsWith
        System.out.println("contains(\"World\"): " + str.contains("World"));
        System.out.println("startsWith(\"Hel\"): " + str.startsWith("Hel"));
        System.out.println("endsWith(\"ld\"): " + str.endsWith("ld"));

        // 6. equals, equalsIgnoreCase
        System.out.println("equals(\"Hello World\"): " + str.equals("Hello World"));
        System.out.println("equalsIgnoreCase(\"hello world\"): " + str.equalsIgnoreCase("hello world"));

        // 7. compareTo & compareToIgnoreCase
        System.out.println("compareTo(\"Hello\"): " + str.compareTo("Hello"));
        System.out.println("compareToIgnoreCase(\"hello WORLD\"): " + str.compareToIgnoreCase("hello WORLD"));

        // 8. indexOf, lastIndexOf
        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));

        // 9. toLowerCase, toUpperCase
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());

        // 10. trim, strip, stripLeading, stripTrailing
        String padded = "  padded  ";
        System.out.println("trim(): '" + padded.trim() + "'");
        System.out.println("strip(): '" + padded.strip() + "'");
        System.out.println("stripLeading(): '" + padded.stripLeading() + "'");
        System.out.println("stripTrailing(): '" + padded.stripTrailing() + "'");

        // 11. replace, replaceAll, replaceFirst
        System.out.println("replace(\"World\", \"Java\"): " + str.replace("World", "Java"));
        System.out.println("replaceAll(\"[aeiou]\", \"*\"): " + str.replaceAll("[aeiou]", "*"));
        System.out.println("replaceFirst(\"l\", \"*\"): " + str.replaceFirst("l", "*"));

        // 12. split
        String csv = "a,b,c";
        String[] parts = csv.split(",");
        System.out.print("split: ");
        for (String p : parts) System.out.print(p + " ");
        System.out.println();

        // 13. join
        String joined = String.join("-", parts);
        System.out.println("join: " + joined);

        // 14. format
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("format: " + formatted);

        // 15. matches
        String email = "user@example.com";
        System.out.println("matches email regex: " + email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"));

        // 16. isEmpty, isBlank
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty: " + empty.isEmpty());
        System.out.println("isBlank: " + blank.isBlank());

        // 17. repeat
        System.out.println("repeat(3): " + "Hi ".repeat(3));

        // 18. toCharArray
        char[] chars = str.toCharArray();
        System.out.print("toCharArray: ");
        for (char c : chars) System.out.print(c + " ");
        System.out.println();

        // 19. codePointAt, codePointBefore
        System.out.println("codePointAt(1): " + str.codePointAt(1));
        System.out.println("codePointBefore(1): " + str.codePointBefore(1));

        // 20. regionMatches
        System.out.println("regionMatches: " + str.regionMatches(6, "Worlds", 0, 5));

        // 21. intern
        String s1 = new String("intern").intern();
        String s2 = "intern";
        System.out.println("s1 == s2: " + (s1 == s2));

        // 22. compare with null safety
        System.out.println("null-safe equals: " + "test".equals(null));

        // 23. StringBuilder
        StringBuilder sb = new StringBuilder("Mutable");
        sb.append(" String").insert(0, "A ").replace(2, 9, "Flexible").delete(0, 2);
        System.out.println("StringBuilder: " + sb.toString());

        // 24. StringBuffer
        StringBuffer sbf = new StringBuffer("Thread");
        sbf.append(" Safe");
        System.out.println("StringBuffer: " + sbf.toString());

        // 25. getBytes()
        byte[] bytes = str.getBytes();
        System.out.print("getBytes(): ");
        for (byte b : bytes) System.out.print(b + " ");
        System.out.println();

        // 26. lines() (Java 11+)
        String multiline = "Line1\nLine2\nLine3";
        System.out.println("lines():");
        multiline.lines().forEach(System.out::println);




        // 1. Split by comma
        csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("1. Split by comma: ");
        for (String fruit : fruits) System.out.println(fruit);

        // 2. Split by single space
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("\n2. Split by space: ");
        for (String word : words) System.out.println(word);

        // 3. Split by multiple spaces using regex
        String messy = "Java   is    cool";
        String[] parts1 = messy.split("\\s+");
        System.out.println("\n3. Split by multiple spaces: ");
        for (String part : parts1) System.out.println(part);

        // 4. Split by dot (must escape)
        String domain = "www.google.com";
        String[] levels = domain.split("\\.");
        System.out.println("\n4. Split by dot: ");
        for (String level : levels) System.out.println(level);

        // 5. Split by pipe (escaped)
        String animals = "cat|dog|mouse";
        String[] pets = animals.split("\\|");
        System.out.println("\n5. Split by pipe: ");
        for (String pet : pets) System.out.println(pet);

        // 6. Split by digits
        String mixed = "abc1def2ghi3";
        String[] parts2 = mixed.split("\\d");
        System.out.println("\n6. Split by digits: ");
        for (String part : parts2) System.out.println(part);

        // 7. Split by empty string
        String letters = "ABC";
        String[] charss = letters.split("");
        System.out.println("\n7. Split by empty string: ");
        for (String ch : charss) System.out.println(ch);

        // 8. Split with limit (split only once)
        String data = "one,two,three,four";
        String[] limited = data.split(",", 2);
        System.out.println("\n8. Split with limit=2: ");
        for (String value : limited) System.out.println(value);

        // 9. Split with limit = -1 (keep trailing empty)
        String trail = "a,b,,";
        String[] trailSplit = trail.split(",", -1);
        System.out.println("\n9. Split with trailing empty strings (limit = -1): ");
        for (String value : trailSplit) System.out.println("[" + value + "]");

        // 10. Split by newline
        String lines = "Line1\nLine2\nLine3";
        String[] lineArray = lines.split("\\n");
        System.out.println("\n10. Split by newline: ");
        for (String line : lineArray) System.out.println(line);

        // 11. Split by regex alternation (| or :)
        String mixedDelimiters = "name:John|age:30|city:New York";
        String[] fields = mixedDelimiters.split("\\||:");
        System.out.println("\n11. Split by | or : ");
        for (String field : fields) System.out.println(field);

        // 12. Split with no match
        String single = "hello";
        String[] singleSplit = single.split(",");
        System.out.println("\n12. Split with no match: ");
        for (String s : singleSplit) System.out.println(s);

        // 13. Split using word boundaries (advanced)
        String wordBoundary = "I-love-Java!";
        String[] tokens = wordBoundary.split("\\b");
        System.out.println("\n13. Split by word boundary (\\b): ");
        for (String token : tokens) System.out.println("[" + token + "]");


        String a = "asdkjahq qq3234234 sakdakldja q3#$^&*()";
        parts = a.split("[^0-9a-zA-Z]+");
        for (int i=0 ;i<parts.length;i++){
            System.out.print(parts[i]);
        }



        // 1. Replace all digits with "*"
        String s11 = "Order123Number456";
        System.out.println("1. " + s11.replaceAll("\\d", "*"));
        // \d means a digit (0–9)

        // 2. Remove all digits
        String s22 = "abc123xyz456";
        System.out.println("2. " + s22.replaceAll("\\d", ""));
        // Replaces all digits with empty string

        // 3. Replace all non-alphanumeric characters
        String s3 = "hello@java#123!";
        System.out.println("3. " + s3.replaceAll("[^a-zA-Z0-9]", "_"));
        // [^a-zA-Z0-9] matches anything that's not a letter or digit

        // 4. Remove all special characters
        String s4 = "A$B^C&D*E";
        System.out.println("4. " + s4.replaceAll("[^a-zA-Z0-9]", ""));
        // Keeps only letters and digits

        // 5. Replace multiple spaces with a single space
        String s5 = "Java    is   awesome";
        System.out.println("5. " + s5.replaceAll("\\s+", " "));
        // \s+ means one or more whitespace characters

        // 6. Remove all whitespaces (tabs, spaces, newlines)
        String s6 = "Line1\nLine2\tTabbed Space";
        System.out.println("6. " + s6.replaceAll("\\s", ""));
        // Removes all kinds of whitespace

        // 7. Replace lowercase vowels with *
        String s7 = "Beautiful day in Java";
        System.out.println("7. " + s7.replaceAll("[aeiou]", "*"));
        // Only lowercase vowels

        // 8. Replace both upper and lowercase vowels
        String s8 = "AEIOUaeiou";
        System.out.println("8. " + s8.replaceAll("(?i)[aeiou]", "*"));
        // (?i) makes it case-insensitive

        // 9. Replace words starting with capital letter
        String s9 = "Hello World From Java";
        System.out.println("9. " + s9.replaceAll("\\b[A-Z]\\w*", "[TitleWord]"));
        // \b means word boundary; [A-Z]\w* matches capitalized words

        // 10. Replace word "Java" with "Python"
        String s10 = "Java is popular. I love Java!";
        System.out.println("10. " + s10.replaceAll("Java", "Python"));

        // 11. Mask part of an email
        String emails = "user@example.com";
        System.out.println("11. " + emails.replaceAll("(?<=.).(?=[^@]*?@)", "*"));
        // Replace characters before @ except the first one

        // 12. Replace consecutive repeated letters
        String s12 = "Booookkeeeppeerr";
        System.out.println("12. " + s12.replaceAll("(.)\\1+", "$1"));
        // (.)\\1+ means repeated characters; "$1" keeps only one

        // 13. Insert hyphen between every character
        String s13 = "Java";
        System.out.println("13. " + s13.replaceAll("", "-"));
        // Adds "-" between each char, including ends

        // 14. Replace numbers with [number]
        String s14 = "There are 4 cats and 12 dogs.";
        System.out.println("14. " + s14.replaceAll("\\d+", "[number]"));
        // \d+ matches one or more digits

        // 15. Normalize Unicode to ASCII
        String s15 = "Café Déjà Vu";
        System.out.println("15. " + s15.replaceAll("[éàè]", "e"));
        // Replaces accents with ASCII equivalents (manual approach)

    }
}
