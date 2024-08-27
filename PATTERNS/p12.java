package PATTERNS;

public class p12 {

//             * * * * *
//              * * * *
//               * * *
//                * *
//                 *
//                 *
//                * *
//               * * *
//              * * * *
//             * * * * *


    static void pat(int n){
        for (int line = 0; line < n*2 ; line++) {
            if(line<n)
            {
                for (int space = 0; space <line ; space++) {
                    System.out.print(" ");
                }
                for (int ast = 0; ast < n-line; ast++) {
                    System.out.print("G ");
                }
                System.out.println();
            }
            else
            {
                for (int space = 0; space <(n*2)-(line+1) ; space++) {
                    System.out.print(" ");
                }
                for (int ast = 0; ast < (line+1)-n; ast++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        pat(5);
    }
}
