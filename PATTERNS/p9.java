package PATTERNS;

public class p9 {
    static void print(int n) {
                    /*          *********
                                 *******
                                  *****
                                   ***
                                    *
                                                                        */

        for (int lines = 0; lines < n; lines++) {

            for (int space = 0; space < lines; space++) {
                System.out.print(" ");
            }
            for (int asteric = 0; asteric < (n * 2) - (lines * 2) - 1; asteric++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        print(5);
    }
}
