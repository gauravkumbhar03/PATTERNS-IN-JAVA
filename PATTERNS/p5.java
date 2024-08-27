package PATTERNS;

public class p5 {


    public static void print(int n) {
        //    *****
        //    *****
        //    *****
        //    *****
        //    *****
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void print2(int n) {
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //or

        for (int i = n; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //or
        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print3(int n) {
//      *****
//      ****
//      ***
//      **
//      *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print4(int n) {
//         *
//        **
//       ***
//      ****
//     *****

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void print5(int n) {
//     *****
//     ****
//     ***
//     **
//     *
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j > i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    static void print6(int n) {
        //             *****
        //              ****
        //               ***
        //                **
        //                 *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
                if (j >= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void print7(int n) {

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
//        print(5);
//        System.out.println();
//        print2(5);
//        System.out.println();
//        print3(5);
//        System.out.println();
        //       print4(n);
        //       print5(5);
//        System.out.println();
        print7(n);

    }
}
