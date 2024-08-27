package PATTERNS;
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
public class p20 {
    static void pattern(int n)
    {
        for (int i =1; i<=n;i++)
        {
            for(int j =1 ;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
