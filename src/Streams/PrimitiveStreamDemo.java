package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamDemo {
    public static void main(String[] args) {
        // range
        IntStream.range(1, 5).forEach(System.out::println); // 1 to 4

        // rangeClosed
        IntStream.rangeClosed(1, 5).forEach(System.out::println); // 1 to 5

        // sum
        System.out.println("Sum: " + IntStream.of(1, 2, 3, 4, 5).sum());

        // average
        System.out.println("Average: " + IntStream.of(10, 20, 30).average().getAsDouble());

        // min
        IntStream.of(3, 1, 7).min().ifPresent(System.out::println);

        // max
        IntStream.of(3, 1, 7).max().ifPresent(System.out::println);

        // summaryStatistics
        System.out.println(IntStream.of(2, 4, 6, 8).summaryStatistics());

        // boxed
        Stream<Integer> boxed = IntStream.rangeClosed(1, 3).boxed();
        boxed.forEach(System.out::println);

        // mapToObj
        IntStream.of(1, 2, 3).mapToObj(n -> "Num:" + n).forEach(System.out::println);
    }
}
/*
*1. Stream<T> (Reference Stream) Built-in Methods
👉 Creation methods

stream() → From a collection (e.g., list.stream()).

parallelStream() → Parallel processing from collection.

Stream.of(T… values) → From values.

Stream.empty() → Empty stream.

Stream.generate(Supplier<T>) → Infinite stream, must use .limit().

Stream.iterate(seed, UnaryOperator<T>) → Infinite stream with iteration logic.

Stream.concat(stream1, stream2) → Combines two streams.

Stream.builder() → Manually build a stream.

Stream.ofNullable(T value) → Returns empty if null. (Java 9+).

👉 Intermediate Operations (Lazy; return Stream)

filter(Predicate<T>) → Keeps only elements matching condition.

map(Function<T,R>) → Transforms each element into another.

mapToInt(ToIntFunction<T>) / mapToLong / mapToDouble → Converts object stream to primitive stream.

flatMap(Function<T,Stream<R>>) → Flattens nested streams.

flatMapToInt / flatMapToLong / flatMapToDouble → Flattening into primitive streams.

distinct() → Removes duplicates (uses equals()).

sorted() → Natural sorting.

sorted(Comparator<T>) → Custom sorting.

peek(Consumer<T>) → Debugging; lets you see elements during pipeline.

limit(long n) → Truncate stream to first n elements.

skip(long n) → Skip first n elements.

unordered() → Removes encounter-order guarantee (helps performance in parallel).

👉 Terminal Operations (Consumes stream, produces result)

forEach(Consumer<T>) → Performs action on each element (order not guaranteed in parallel).

forEachOrdered(Consumer<T>) → Ordered version of forEach.

toArray() → Collects elements into array.

toArray(IntFunction<A[]>) → Collects into custom array type.

reduce(BinaryOperator<T>) → Reduces elements (returns Optional<T>).

reduce(T identity, BinaryOperator<T>) → Reduces with identity value.

reduce(U identity, BiFunction<U,? super T,U>, BinaryOperator<U>) → More complex reduce with different types.

collect(Collector<T,A,R>) → Most powerful operation → collects into List, Set, Map, joining, etc.

min(Comparator<T>) → Minimum element wrapped in Optional.

max(Comparator<T>) → Maximum element wrapped in Optional.

count() → Number of elements.

anyMatch(Predicate<T>) → Returns true if any element matches.

allMatch(Predicate<T>) → Returns true if all match.

noneMatch(Predicate<T>) → Returns true if no element matches.

findFirst() → Returns first element as Optional<T>.

findAny() → Returns any element (useful in parallel).

iterator() → Get an Iterator<T>.

spliterator() → Get a Spliterator<T> (used in parallel splitting).

👉 Stream State / Utility Methods

isParallel() → Checks if stream is parallel.

sequential() → Returns sequential stream.

parallel() → Returns parallel stream.

onClose(Runnable) → Add callback when stream closes.

close() → Closes stream (useful with I/O streams).

🔹 2. Primitive Streams (IntStream, LongStream, DoubleStream)

They have everything from Stream<T> + numeric-specific methods.

👉 Creation

IntStream.range(start, end) → [start, end).

IntStream.rangeClosed(start, end) → [start, end].

IntStream.of(1,2,3,4) → Directly create.

IntStream.generate(IntSupplier) → Infinite stream.

IntStream.iterate(seed, f) → Iterating stream.

IntStream.empty().

👉 Extra Terminal Ops

sum() → Sum of all elements.

average() → Average (returns OptionalDouble).

min() → Minimum (OptionalInt/OptionalLong/OptionalDouble).

max() → Maximum.

summaryStatistics() → Returns stats object (IntSummaryStatistics, DoubleSummaryStatistics).

👉 Extra Conversions

boxed() → Convert IntStream → Stream<Integer>.

mapToObj(IntFunction<R>) → Convert numbers into objects.

🔹 3. Collectors (via Collectors class)

Common built-in collectors (used with .collect()):

Collectors.toList() → Collect to List.

Collectors.toSet() → Collect to Set.

Collectors.toMap(keyMapper, valueMapper) → Map.

Collectors.joining(", ") → Concatenate strings.

Collectors.groupingBy(Function) → Grouping into Map.

Collectors.partitioningBy(Predicate) → Partition into two groups.

Collectors.counting() → Count elements.

Collectors.summarizingInt(...), summarizingDouble(...), summarizingLong(...).

Collectors.averagingInt(...), etc.

Collectors.collectingAndThen(downstream, finisher) → Post-process.

🔹 4. BaseStream Methods (Common to All)

iterator() → Returns Iterator.

spliterator() → Returns Spliterator.

isParallel().

sequential().

parallel().

unordered().

onClose(Runnable).

close().*/
