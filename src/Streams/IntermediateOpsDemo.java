package Streams;


import java.util.Arrays;
import java.util.List;

public class IntermediateOpsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 2, 9, 3, 7);

        // filter
        numbers.stream().filter(n -> n > 5).forEach(System.out::println); // 7 9 7

        // map
        numbers.stream().map(n -> n * n).forEach(System.out::println); // squares

        // flatMap
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );
        nested.stream().flatMap(list -> list.stream()).forEach(System.out::println);

        // distinct
        numbers.stream().distinct().forEach(System.out::println);

        // sorted
        numbers.stream().sorted().forEach(System.out::println);

        // sorted with comparator
        numbers.stream().sorted((a, b) -> b - a).forEach(System.out::println);

        // peek
        numbers.stream()
                .peek(n -> System.out.println("Before filter: " + n))
                .filter(n -> n > 5)
                .peek(n -> System.out.println("After filter: " + n))
                .forEach(System.out::println);

        // limit
        numbers.stream().limit(3).forEach(System.out::println);

        // skip
        numbers.stream().skip(4).forEach(System.out::println);

        // unordered
        numbers.parallelStream().unordered().forEach(System.out::println); // order may vary
    }
}
