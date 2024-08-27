package PATTERNS;

public class p16 {
//           *********
//            *     *
//             *   *
//              * *
//               *
    static void revPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (i == 0 || j == (n - (n - i)) || j == (n + (n - 1) - i)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        revPattern(3);
    }
}
