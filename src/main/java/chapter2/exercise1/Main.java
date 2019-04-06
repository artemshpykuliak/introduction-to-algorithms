package chapter2.exercise1;

public class Main {

    public static void main(String[] args) {

        var array = new int[]{5, 2, 4, 6, 1, 3};
        int[] sortedArray = insertionSort(array);
        print(sortedArray);
    }

    private static int[] insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        return array;
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
