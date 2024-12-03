import java.util.Comparator;

public class Arrays {

    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            byte midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            char midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            double midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            float midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            int midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            long midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            short midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        checkBounds(fromIndex, toIndex, a.length);
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                fromIndex = mid + 1;
            else if (cmp > 0)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    private static void checkBounds(int fromIndex, int toIndex, int length) {
        if (fromIndex < 0 || toIndex > length || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid index range: " + fromIndex + " to " + toIndex);
        }
    }
}