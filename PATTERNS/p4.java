package PATTERNS;
/*                               *
                                 **
                                 ***
                                 ****
                                 ***
                                 **
                                 *                                      */
public class p4 {
    static void pattern1(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totslcolumn = i > n ? 2 * n - i : i;
            {
                for (int j = 0; j < totslcolumn; j++) {

                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void p2(int n) {

        for (int i = 0; i <= 2 * n; i++) {
            //  int stars = i <= n ? i : 2 * n - i;
            if (i <= n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    /* TERNERY OPERATOR  "?"  it is shortform for if-else statement */

    public static void main(String[] args) {
        p3(4);
    }

    static void p3(int n) {
        for (int i = 0; i < n * 2; i++) {
            int star = i <= n ? i : n * 2 - i;
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p(int n) {
        for (int line = 1; line < n * 2; line++) {
            if (line <= n) {
                for (int stars = 1; stars <= line; stars++) {
                    System.out.print("*");
                }
            } else {
                for (int stars = 0; stars < 2 * n - line; stars++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


}
