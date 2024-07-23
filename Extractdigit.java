import java.util.*;
public class Extractdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String string=sc.nextLine();
        String value="";

        for (char num :string.toCharArray())
        {
            if(Character.isDigit(num))
            {
                value=value+num;
            }
        }
       System.out.println(value);
    }
}
