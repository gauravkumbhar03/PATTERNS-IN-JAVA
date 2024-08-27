package PATTERNS;

public class p11 {
//             * * * * *
//              * * * *
//               * * *
//                * *
//                 *


    public static void print(int n){
        for (int line = 0; line <n ; line++) {
            for (int space = 0; space <line ; space++) {
                System.out.print(" ");
            }
            for (int ast = 0; ast <n-line ; ast++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}
