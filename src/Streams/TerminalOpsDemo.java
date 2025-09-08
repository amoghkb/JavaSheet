package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOpsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arjun", "Rahul", "Amogh", "Ravi", "Ananya");

        // forEach
        names.stream().forEach(System.out::println);

        // forEachOrdered
        names.parallelStream().forEachOrdered(System.out::println);

        // toArray
        Object[] arr = names.stream().toArray();
        System.out.println(Arrays.toString(arr));

        // toArray with generator
        String[] strArr = names.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(strArr));

        // reduce
        Optional<String> reduced = names.stream().reduce((a, b) -> a + "-" + b);
        reduced.ifPresent(System.out::println);

        // reduce with identity
        String joined = names.stream().reduce("Start", (a, b) -> a + "->" + b);
        System.out.println(joined);

        // collect
        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println(list);

        // min
        names.stream().min(String::compareTo).ifPresent(System.out::println);

        // max
        names.stream().max(String::compareTo).ifPresent(System.out::println);

        // count
        long count = names.stream().count();
        System.out.println("Count: " + count);

        // anyMatch
        System.out.println(names.stream().anyMatch(n -> n.startsWith("A"))); // true

        // allMatch
        System.out.println(names.stream().allMatch(n -> n.length() > 2));

        // noneMatch
        System.out.println(names.stream().noneMatch(n -> n.equals("XYZ")));

        // findFirst
        names.stream().findFirst().ifPresent(System.out::println);

        // findAny
        names.parallelStream().findAny().ifPresent(System.out::println);
    }
}
