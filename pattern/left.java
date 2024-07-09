import java.util.*;
public class left {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Range:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>0;j--)
            {
                if(i<=j)
                {
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
