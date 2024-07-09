import java.util.*;;
public class passcal {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(" ");
            }
            a--;
            for(int j=0;j<=i;j++)
            {
                System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
            }
            System.out.println();
        }
    }
}
