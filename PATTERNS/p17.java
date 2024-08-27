package PATTERNS;
/*
*           +   +
            +   +
            +   +
            +   +
            +   +
            +++++
            +   +
            +   +
            +   +
            +   +
* */
public class p17 {
    static void pt(int n)
    {
        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==0||i==n||j==n-1){
                    System.out.print("+");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pt(5);
    }
}
