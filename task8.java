import java.util.*;
public class task8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 1:");
        int input1=sc.nextInt();
        // System.out.println("Input 2:");
        // int input2=sc.nextInt();
        // System.out.println("Input 3:");
        // int input3=sc.nextInt();
        int count=0;
        int arr[]=new int[10];
        while (input1>0) 
        {
            int temp=input1%10;
            arr[count]=temp;
            count++; 
           input1/=10;
        }
        // for(int i=0;i<count;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
       // System.out.println();
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }

}