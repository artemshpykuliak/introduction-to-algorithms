package chapter2.task2;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 36, 74, 1, 9, 12};
        int[] sortedArray = sort(array, 0, array.length - 1);
        print(sortedArray);
    }

    private static int[] sort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {

            //Find middlePoint
            int middleIndex = (lowIndex + highIndex) / 2;

            //Sort first and second halves
            sort(array, lowIndex, middleIndex);
            sort(array, middleIndex + 1, highIndex);

            // Merge the sorted halves
            merge(array, lowIndex, middleIndex, highIndex);
        }
        return array;
    }

    private static void merge(int[] array, int lowIndex, int middleIndex, int highIndex) {

        //Find size of the two arrays to be merged
        int n1 = middleIndex - lowIndex + 1;
        int n2 = highIndex - middleIndex;

        /*Create temp arrays*/
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < L.length; i++) {
            L[i] = array[lowIndex + i];
        }
        for (int i = 0; i < R.length; i++) {
            R[i] = array[middleIndex + 1 + i];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = lowIndex;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /*Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /*Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    private static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

}
