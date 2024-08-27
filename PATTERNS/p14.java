package PATTERNS;
                /*         * //PATTERN 1
                         *
                       *
                     *
                   *
                 *

                      */ //PATTERN2
/*
*                  *
                     *
                       *
                         *
                           *
 */
public class p14 {
    public static void print(int n) {
        for (int lines = 0; lines <= n; lines++) {
            for (int space = 0; space < n - lines; space++) {
                System.out.print(" ");
            }

            for (int ast = 0; ast <= n * 2; ast++) {
                if (ast == n - lines) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
static void print2(int n)
    {
       for (int line =0;line<n;line++)
        {
             for(int space=0;space<=line;space++)
             {
                 System.out.print(" ");
             }
            for (int ast = 0; ast <1; ast++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
     //   print2(5);
    }
}
