package Basics;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // 1. Declaration and Initialization
        int[] numbers = {5, 2, 9, 1, 7};
        String[] fruits = new String[]{"Apple", "Banana", "Mango"};

        // 2. Access and Modification
        System.out.println("Original first element: " + numbers[0]);
        numbers[0] = 10; // modifying
        System.out.println("Modified first element: " + numbers[0]);

        // 3. Traversing arrays
        System.out.print("Numbers using for-loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Fruits using for-each loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 4. Multi-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("2D Array using Arrays.deepToString(): " + Arrays.deepToString(matrix));

        // =================== BUILT-IN METHODS ===================

        // 5. toString()
        System.out.println("Numbers (toString): " + Arrays.toString(numbers));

        // 6. sort()
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // 7. parallelSort() (works faster on large arrays)
        int[] moreNums = {50, 20, 40, 10, 30};
        Arrays.parallelSort(moreNums);
        System.out.println("Parallel sorted array: " + Arrays.toString(moreNums));

        // 8. binarySearch() (array must be sorted)
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7 in numbers: " + index);

        // 9. copyOf()
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // 10. copyOfRange()
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4); // from index 1 to 3
        System.out.println("Copy of range (1 to 3): " + Arrays.toString(rangeCopy));

        // 11. fill()
        int[] filled = new int[5];
        Arrays.fill(filled, 99);
        System.out.println("Filled array: " + Arrays.toString(filled));

        // 12. equals()
        System.out.println("numbers equals copy? " + Arrays.equals(numbers, copy));

        // 13. deepEquals() (for nested arrays)
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("matrix deepEquals matrix2? " + Arrays.deepEquals(matrix, matrix2));

        // =========================================================
    }
}
