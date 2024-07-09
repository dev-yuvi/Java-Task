import java.lang.reflect.Array;
import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Range:");
        int range=sc.nextInt();
        int arr[]=new int[range];
        int arr1[]=new int[range];
        int cout=0;
        for(int i=0;i<range;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0,k=0;i<range;i++)
        {
            if(arr[i]>0)
            {
                arr1[k]=arr[i];
                k++;
                cout++;
            }
        }
        int temp;
        for(int k=0;k<cout;k++)
        {
            for(int j=k+1;j<cout;j++)
            {
                if(arr1[k]>arr1[j])
                {
                    temp=arr1[k];
                    arr1[k]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for(int i=0;i<cout;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        // int mid1=cout/2;
        if(cout%2==0)
        {
            float x=arr1[(cout/2)-1];
            float y=arr1[cout/2];
            float mid=(x+y)/2;
            System.out.println("Mid Element:"+mid);
        }
        else if(cout%2==1)
        {
            int mid=(cout-1)/2;
            System.out.println("Mid Element:"+arr1[mid]);
        }
        
    }
}
