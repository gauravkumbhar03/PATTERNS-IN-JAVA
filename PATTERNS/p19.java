package PATTERNS;


/*
            00000000010
            000000009
            00000008
            0000007
            000006
            00005
            0004
            003
            02
            1
* */
public class p19 {
    public void pattern26(int n){
        //      int k=n ;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                if(j!=(n-i)-1){
                    System.out.print(0);
                }
                else {
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p19 n = new p19();

        n.pattern26(10);
    }
}
