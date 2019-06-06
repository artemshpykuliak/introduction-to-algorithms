package chapter6;

import java.util.ArrayList;
import java.util.List;

public class HeapMax {

    private final List<Integer> data = new ArrayList<>();

    public HeapMax() {
        data.add(0);
    }

    // - p l r
    // 0 1 2 3
    public void insert(final int value) {
        data.add(value);
        var index = data.size() - 1;
        while (index > 1) {
            final var parentIndex = index / 2;
            final var child = data.get(index);
            final var parent = data.get(parentIndex);
            if (child < parent) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    public int popMin() {
        if (data.size() < 2) {
            throw new IllegalStateException("Heap is empty.");
        }
        if (data.size() == 2) {
            return data.remove(1);
        }

        final var value = data.get(1);
        data.set(1, data.remove(data.size() - 1));
        var parentIndex = 1;
        while (true) {
            final var leftIndex = parentIndex * 2;
            final var rightIndex = parentIndex * 2 + 1;
            var tIndex = 0;
            if (leftIndex < data.size() && rightIndex < data.size()) {
                tIndex = data.get(leftIndex) < data.get(rightIndex) ? leftIndex : rightIndex;
            } else if (leftIndex < data.size()) {
                tIndex = leftIndex;
            }
            if (tIndex > 0 && data.get(tIndex) < data.get(parentIndex)) {
                swap(parentIndex, tIndex);
                parentIndex = tIndex;
            } else {
                break;
            }
        }
        return value;
    }

    public boolean isEmpty() {
        return data.size() == 1;
    }

    private void swap(final int i1, final int i2) {
        var e1 = data.get(i1);
        var e2 = data.get(i2);
        data.set(i1, e2);
        data.set(i2, e1);
    }

    private static void heapSort(final int... values) {
        final var heap = new HeapMax();
        for (final var value : values) {
            heap.insert(value);
        }
        System.out.println("Sorted.");
        while (!heap.isEmpty()) {
            System.out.println(heap.popMin());
        }

        // O(n*log(n))
    }

    public static void main(final String[] args) {
        // insert: add value to the end (right most node, on last level) and pop it up until it is in the place (parent is smaller)
        // remove: store item under index 1 to be returned, and move last item to pos 1, push it down
        heapSort();
        heapSort(5);
        heapSort(5, 1);
        heapSort(5, 1, 5, 13, 2, 1, 4, 3);
        heapSort(2, 5, 1, 4, 8, 6);
    }
}
