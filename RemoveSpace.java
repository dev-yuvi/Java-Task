import java.util.*;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String string =sc.nextLine();
        String str[]=string.split(" ");
        for (String str2 : str) {
            System.out.print(str2);
        }
    }
}
