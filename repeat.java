import java.util.Scanner;;
public class repeat {
    public static Object repeaString(int range)
    {
        if(range>0)
        {   
            repeaString(range-1);
            System.out.print("3".repeat(range)+" ");
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Repeated Digit is:");
        int range=sc.nextInt();
        System.out.print(repeaString(range));
    }
    
}
