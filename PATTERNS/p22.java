package PATTERNS;

/*
          *             *
            *         *
              *     *
                * *
                * *
              *     *
            *         *
          *             *
                                                            */

public class p22 {
    public static void xPattern(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==i||j==n-i-1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }public static void main(String[] args) {
        xPattern(10);
    }
}
