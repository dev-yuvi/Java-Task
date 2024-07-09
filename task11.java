import java.util.*;
public class task11 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The  Squre Matrix:");
        int n=sc.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   
                if(i==j)
                {
                int last=arr[i][j];
                arr[i][j]=arr[i][(n-1)-i];
                arr[i][(n-1)-i]=last;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int s1=n/2;
        System.out.println(arr[s1][s1]);
    }
}
