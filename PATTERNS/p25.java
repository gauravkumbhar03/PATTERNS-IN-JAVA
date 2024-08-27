package PATTERNS;

public class p25 {
//                 1
//               1   1
//             1   2   1
//           1   3   3   1
//         1   4   6   4   1
    public static void normalTriangle(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        normalTriangle(5);
    }
}
