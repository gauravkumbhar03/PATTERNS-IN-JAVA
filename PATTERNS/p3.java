package PATTERNS;

public class p3 {
    static void pattern(int n)
    {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
//1
//12
//123
//1234
//12345
    public static void main(String[] args) {
        pattern(6);
    }
}
