import java.util.*;
public class full {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        int n= sc.nextInt();
        int a=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(" ");
            }
            a--;
            for(int j=a+1;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
