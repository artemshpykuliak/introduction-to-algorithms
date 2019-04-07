package chapter2.task1;

public class InsertionDescendSort {
    public static void main(String[] args) {
        var arrayA = new int[]{31, 41, 59, 26, 41, 58};
        var arrayB = new int[]{32, 42, 57, 25, 58, 60};
        int[] ints = insertionSort(arrayA);
        for (int anInt : ints) {
            System.out.print(anInt + ", ");
        }
        System.out.println();
        System.out.println("-----");
        System.out.println(match(arrayA, arrayB));
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

    private static int match(int[] arrayA, int[] arrayB) {
        int firstElement = 0;
        for (int value : arrayA) {
            firstElement = value;
            for (int secondElement : arrayB) {
                if (firstElement == secondElement) return firstElement;
            }
        }
        return firstElement;
    }
}
