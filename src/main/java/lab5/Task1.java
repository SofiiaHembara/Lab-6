package lab5;
// How do I write a generic method to exchange 2 different elements in an array in Java?
public final class Task1 {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
