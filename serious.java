import java.util.Scanner;
public class serious {
    public static String even(int end)
    {
        if(end>=0)
        {
            if(end%2==0)
            {   
                even(end-2);
                System.out.print(end+" ");
                
               
            }
            else
            {
                return even(end-1);
            }
        }
        return "";
        
    }
    public static String odd(int end)
    {
        if(end>=0)
        {
            if(end%2!=0)
            {   
                odd(end-2);
                System.out.print(end+" ");
                
               
            }
            else
            {
                return odd(end-1);
            }
            
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        System.out.println(even(end));
        System.out.println(odd(end));
    }
    
}
