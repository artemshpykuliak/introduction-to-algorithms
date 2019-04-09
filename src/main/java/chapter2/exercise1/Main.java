package chapter2.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var array = new int[]{3, 2, 1};
        int[] sortedArray = insertionSort(array);
        print(sortedArray);

        System.out.println("\r\n");
        System.out.println("--------");

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(3, 5);
        map.put(2, 0);

        for (Map.Entry<Integer, Integer> reelNumber : map.entrySet()) {
            System.out.println(reelNumber.getKey() + " : " + reelNumber.getValue());
        }
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
