
package chapter4;

public class FindMaxCrossingSubarray {
    public static void main(String[] args) {
        int[] array = new int[]{-2, 3, 5, -4, 1, -3, 7, 2, -9};
        int midIndex = (array.length - 1) / 2;
        int leftSum = 0;
        for (int i = 0; i <= midIndex; i++) {
            leftSum = leftSum + array[i];
        }

        int rightSum = 0;
        for (int i = midIndex + 1; i < array.length; i++) {
            rightSum = rightSum + array[i];
        }

        System.out.println(leftSum + " : " + rightSum);
    }
}
