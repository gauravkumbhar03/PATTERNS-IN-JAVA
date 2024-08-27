package PATTERNS;

public class p7 {
    static void print(int n) {
//         *
//         **
//         ***
//         ****
//         *****
//         ****
//         ***
//         **
//         *

        for (int i = 0; i < n * 2; i++) {
            if (i <= n / 2) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else if (i > n / 2) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
