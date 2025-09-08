package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamCreationDemo {
    public static void main(String[] args) {
        // 1. From Collection
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        fruits.stream().forEach(System.out::println);

        // 2. Parallel stream
        fruits.parallelStream().forEach(f -> System.out.println("Parallel: " + f));

        // 3. From values
        Stream.of("One", "Two", "Three").forEach(System.out::println);

        // 4. Empty stream
        Stream.empty().forEach(System.out::println); // prints nothing

        // 5. Generate (infinite)
        Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);

        // 6. Iterate
        Stream.iterate(1, n -> n * 2).limit(5).forEach(System.out::println); // 1 2 4 8 16

        // 7. Concat
        Stream<String> s1 = Stream.of("A", "B");
        Stream<String> s2 = Stream.of("C", "D");
        Stream.concat(s1, s2).forEach(System.out::println);

        // 8. Builder
        Stream<String> stream = Stream.<String>builder().add("X").add("Y").add("Z").build();
        stream.forEach(System.out::println);

        // 9. ofNullable (Java 9+)
        Stream.ofNullable(null).forEach(System.out::println); // prints nothing
        Stream.ofNullable("Safe").forEach(System.out::println); // prints "Safe"
    }
}
