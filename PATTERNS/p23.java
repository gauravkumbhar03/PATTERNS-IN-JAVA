package PATTERNS;
                    //          *                   0
                    //         * *                  1
                    //        *   *                 2
                    //       *     *                3
                    //      *       *               4
                    //       *     *                5
                    //        *   *                 6
                    //         * *                  7
                    //          *                   8
public class p23 {
    public static void emptyTriangle(int n){
        for (int i = 0; i <=n*2 ; i++) {
            for (int j = 0; j <=n*2 ; j++) {
                if(i<=n){
                    if(j==n+i||j==n-i){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                 if(i>n){
                    if(j==i-n||j==(n*2)-(i-n)){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

                        public static void main(String[] args) {
                            emptyTriangle(4);
                        }
}
