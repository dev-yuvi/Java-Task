import java.util.Scanner;
public class digit {
    public static int sum(int digit)
    {   
        int sum=0;
        while (digit>0) 
        {
         int temp=digit%10;
         sum=sum+temp;
         digit/=10; 
         
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit:");
        int digit=sc.nextInt();
        System.out.println(sum(digit));
    }
    
}
