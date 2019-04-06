package chapter1;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int a, b = 1, c = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            array[i] = b;
        }
        System.out.println(b);
        System.out.println("-------");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
