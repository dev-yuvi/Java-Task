import java.util.*;
public class invertfull {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
               if(i==j){
                 System.out.print("*" );
               }
               else
               {
                System.out.print("* ");
               }
            }
            if((i!=n-1))
            {
                System.out.println();
            }
            if((i==n-2))
            {
                break;
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("_");
            }
        }
    }
}
