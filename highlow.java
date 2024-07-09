import java.util.Scanner;
public class highlow {
    public static String alternate(int start,int end)
    {
        if(end>0)
        {
            if(start<=end)
            {    System.out.print(end+" "+start+" ");
                alternate(start+1, end-1);
                System.out.print(start+" "+end+" ");
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter The Range1:");
        // int start=sc.nextInt();
        System.out.println("Enter The Range2:");
        int end=sc.nextInt();
        System.out.println(alternate(1, end));
        
    }
    
}
