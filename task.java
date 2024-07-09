import java.util.Scanner;
import java.util.ArrayList;
public class task {
    public static void main(String args[])
    {
        int temp; 
        ArrayList<Integer>ar=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        int Range=sc.nextInt();
        int arr[]=new int[Range];
        for(int i=0;i<Range;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp1=0;
        int cout=0;
        for(int i=0;i<Range;i++)
        {
            if(arr[i]>=temp1)
            {
              ar.add(arr[i]);
            }
        }
        for(int i=0;i<Range;i++)
        {
            for(int j=i+1;j<Range;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        cout=ar.size();
        int mid=cout/2;
        for (int i : ar) 
        {
            if(i==mid)
            System.out.print(i+" ");
        }
}
   
}