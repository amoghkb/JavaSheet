package Collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");   // add at end
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Initial list: " + fruits);

        // 3. Adding element at specific index
        fruits.add(2, "Grapes");
        System.out.println("After adding at index 2: " + fruits);

        // 4. Getting an element by index
        String f = fruits.get(1);
        System.out.println("Element at index 1: " + f);

        // 5. Updating (set) element
        fruits.set(1, "Blueberry");
        System.out.println("After updating index 1: " + fruits);

        // 6. Removing by index
        fruits.remove(3); // removes "Mango"
        System.out.println("After removing index 3: " + fruits);

        // 7. Removing by object
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // 8. Checking if element exists
        System.out.println("Contains 'Orange'? " + fruits.contains("Orange"));
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // 9. Size of list
        System.out.println("Size of list: " + fruits.size());

        // 10. isEmpty check
        System.out.println("Is list empty? " + fruits.isEmpty());

        // 11. Index search
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println("List now: " + fruits);
        System.out.println("First index of 'Orange': " + fruits.indexOf("Orange"));
        System.out.println("Last index of 'Banana': " + fruits.lastIndexOf("Banana"));

        // 12. Converting to array
        Object[] arr = fruits.toArray();
        System.out.println("Array elements:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // 13. Iterating using iterator
        System.out.print("Using Iterator: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 14. Iterating using ListIterator (both directions)
        System.out.print("Using ListIterator forward: ");
        ListIterator<String> lit = fruits.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        System.out.print("Using ListIterator backward: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // 15. SubList (portion of list)
        List<String> sub = fruits.subList(1, 3); // 1 inclusive, 3 exclusive
        System.out.println("Sublist (1 to 2): " + sub);

        // 16. forEach (Java 8+)
        System.out.print("Using forEach: ");
        fruits.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 17. EnsureCapacity and trimToSize (capacity mgmt, not visible in output)
        ArrayList<Integer> numbers = new ArrayList<>(5); // initial capacity 5
        numbers.ensureCapacity(10); // ensure can hold at least 10
        numbers.add(1);
        numbers.add(2);
        numbers.trimToSize(); // reduce capacity to current size
        System.out.println("Numbers list after ensureCapacity & trimToSize: " + numbers);

        // 18. Clearing the list
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Is empty now? " + fruits.isEmpty());
    }
}
