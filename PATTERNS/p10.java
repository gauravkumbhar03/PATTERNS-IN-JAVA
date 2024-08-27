package PATTERNS;

public class p10 {
//                        *
//                       * *
//                      * * *
//                     * * * *
//                    * * * * *


    static void print(int n) {
        for (int line = 0; line < n; line++)
        {
            for (int space = 0; space <= n - line; space++) {
                System.out.print(" ");
            }
            for (int ast = 0; ast <= line; ast++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {
      triangle(6);
    }
    public static void triangle(int n)
    {
//             0
//            0 1
//           0 1 2
//          0 1 2 3
//         0 1 2 3 4
//        0 1 2 3 4 5
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <(1+i) ; k++) {
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }

}
