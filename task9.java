import java.util.*;
public class task9 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input:");
        int input1=sc.nextInt();
        int []arr=new int[10];
        while (input1>0) 
        {
            int digit=input1%10;
            arr[digit]++;
            input1/=10;    
        }    
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=2)
            {
                System.out.print(i+" "+"no.of.times:"+arr[i]+" ");
            }
        }
    }
}
