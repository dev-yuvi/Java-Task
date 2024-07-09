import java.util.*;
public class task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String 1");
        String str1=sc.nextLine();
        System.out.println("Enter The String 2");
        String str2=sc.nextLine();
        if(str1.contains(str2))
        {
            System.out.println(str1.indexOf(str2));
        }
        else
        {
            System.out.println("Invalid:");
        }
    }
}
