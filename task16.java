import java.util.*;
public class task16 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Row&Col");
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    int [][] transpose=new int [n][n];
    int [][]arr2=new int [n][n];
    int sum=0;
    int mid=0;
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
        for(int i=0,j=(n-1);i<n;i++,j--)
        {
            int temp=arr[i][i]+arr[i][j];
            sum+=temp;
           // System.out.println(arr[i][i]+arr[i][j]);
            mid=arr[n/2][n/2];
        }
        sum-=mid;
        System.out.println(sum);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                transpose[i][j]=arr[j][i];
            }
        }
        // for(int i=0,j=(n-1);i<n;i++,j--)
        // {
        //    arr2[i][j]=arr[i][i]-sum;
        //    arr2[i][j]=arr[i][j]-sum;
        //     System.out.println(arr[i][i]-sum);
        //     System.out.println(arr[i][j]-sum);
        // }
        
        if(sum%2==1)
        {
           for(int i=0;i<n;i++)
           {
            for(int j=0;j<n;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
           }
        }
        else
        {
        }
    }
}
