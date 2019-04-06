package chapter2.task1;

public class InsertionDescendSort {
    public static void main(String[] args) {
        var array = new int[]{31, 41, 59, 26, 41, 58};
        int[] ints = insertionSort(array);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static int[] insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && key > array[i]) {
                array[i + 1] = array[i];
                i = i - 1;
                array[i + 1] = key;
            }
        }
        return array;
    }
}
