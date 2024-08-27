package PATTERNS;

public class p8 {
    public static void main(String[] args) {
        //pattern(5);
    }

    static void print(int n) {

        for (int line = 0; line <= n; line++) {
            for (int space = 0; space <= n - line; space++) {
                System.out.print(" ");
            }
            for (int asteric = 0; asteric < (line * 2) + 1; asteric++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print2(int n) {

        for (int line = 0; line <= n; line++) {
            for (int space = 0; space <= n - line; space++) {
                System.out.print(" ");
            }
            for (int asteric = 0; asteric < (line * 2) + 1; asteric++) {
                System.out.print(asteric);
            }
            System.out.println();
        }
    }

    static void println(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

//    static void pattern(int n)
//    {
//     for (int i =0 ; i<n ;i++)
//     {
//         for (int j = 0; j <n*2 ; j++) {
//             if(i==n-1 || j==n-(n-i)|| j==n+(n-i)){
//                 System.out.print("*");
//             }else System.out.print(" ");
//
//         } System.out.println();
//     }
 //  }
}
//                   *
//                  ***
//                 *****
//                *******
//               *********


