import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter option:");
        int option=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(rule(n, option));
    }
    public static int rule(int n,int option)
    {  
        int output;
         if(option%2!=0)
        {
            output=n-(n-1)+(n-2)-(n-3)+(n-4)-(n-5);
            return output;
        }
        else
        {
            output=n+(n-1)-(n-2)+(n-3)-(n-4)+(n-5);
            return output;
        }
    }
}
