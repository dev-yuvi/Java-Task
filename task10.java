import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Num:");
        int input=sc.nextInt();
        int[] arr=new int[10];
        while (input>0) 
        {
            int digit=input%10;
            arr[digit]++;
            input/=10;    
        }
        int n1=0;
        int n2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=2)
            {    
                n1++;
                System.out.println(arr[i]);
            }
            else if(arr[i]==1)
            {   
                n2++;
                System.out.println(arr[i]);
            }
        }
     
    }
}
