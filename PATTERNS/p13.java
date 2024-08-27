package PATTERNS;

public class p13 {
    //         *
    //        * *
    //       *   *
    //      *     *
    //     *********

    public static void print(int n) {
        for (int line = 0; line <= n; line++) {
//            for (int space = 0; space < n - line; space++) {
//                System.out.print(" ");
//            }
            for (int asteric = 0; asteric <(n * 2)+1; asteric++) {
                if (line==n||asteric == (n - line) || asteric == (n + line) ) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
