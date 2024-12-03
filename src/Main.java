import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testPrimitiveArrays();
        testObjectArrays();
        testCollections();
    }

    private static void testPrimitiveArrays() {
        System.out.println("Тест класса arrays (примитивные типы):");

        byte[] byteArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(byteArray, (byte) 30));
        System.out.println(Arrays.binarySearch(byteArray, 1, 4, (byte) 40));

        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println(Arrays.binarySearch(charArray, 'e'));
        System.out.println(Arrays.binarySearch(charArray, 1, 3, 'c'));

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println(Arrays.binarySearch(doubleArray, 3.3));
        System.out.println(Arrays.binarySearch(doubleArray, 0, 3, 1.1));

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
        System.out.println(Arrays.binarySearch(floatArray, 4.4f));
        System.out.println(Arrays.binarySearch(floatArray, 1, 4, 3.3f));

        int[] intArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(intArray, 5));
        System.out.println(Arrays.binarySearch(intArray, 2, 5, 7));

        long[] longArray = {100L, 200L, 300L, 400L};
        System.out.println(Arrays.binarySearch(longArray, 300L));
        System.out.println(Arrays.binarySearch(longArray, 1, 3, 200L));

        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(shortArray, (short) 50));
        System.out.println(Arrays.binarySearch(shortArray, 2, 4, (short) 30));
    }

    private static void testObjectArrays() {
        System.out.println("\nТест класса arrays (с компаратором):");

        String[] stringArray = {"Apple", "Banana", "Cherry", "date"};
        System.out.println(Arrays.binarySearch(stringArray, "Banana", String::compareTo));
        System.out.println(Arrays.binarySearch(stringArray, 1, 3, "Cherry", String::compareTo));

        Integer[] intObjectArray = {10, 20, 30, 40};
        System.out.println(Arrays.binarySearch(intObjectArray, 20, Integer::compare));
        System.out.println(Arrays.binarySearch(intObjectArray, 0, 2, 10, Integer::compare));
    }

    private static void testCollections() {
        System.out.println("\nТест класса Collections:");

        List<Integer> intList = java.util.Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(Collections.binarySearch(intList, 5));
        System.out.println(Collections.binarySearch(intList, 2));

        List<String> stringList = java.util.Arrays.asList("apple", "banana", "cherry");
        System.out.println(Collections.binarySearch(stringList, "cherry", String::compareTo));
        System.out.println(Collections.binarySearch(stringList, "date", String::compareTo));
    }
}