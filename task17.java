import java.util.*;
public class task17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[100000];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {   
                    count=arr[j];
                   arr1[count]++;
                }
            }
        } 
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>=1)
            System.out.println(arr1[i]+" the repeated element is "+i);
            // if(arr1[i]>=2)
            // {
            //     System.out.print(i+" "+"no.of.times:"+arr1[i]+" ");
            // }
            sc.close();
        }
    }
}