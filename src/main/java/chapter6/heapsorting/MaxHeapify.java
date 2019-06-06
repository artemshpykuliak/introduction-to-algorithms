package chapter6.heapsorting;

public class MaxHeapify {

    public static int[] maxHeapify(int[] array, int i) {
        int leftIndex = i * 2 + 1;
        int rightIndex = i * 2 + 2;
        int largest = i;

        if (leftIndex < array.length && array[leftIndex] > array[largest]) {
            largest = leftIndex;
        }

        if (rightIndex < array.length && array[rightIndex] > array[largest]) {
            largest = rightIndex;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            maxHeapify(array, largest);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
        int[] ints = maxHeapify(array, 2);
        for (int i : ints) {
            System.out.print(i + ", ");
        }
    }
}
