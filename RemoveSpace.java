import java.util.*;
public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String string =sc.nextLine();
        String str[]=string.split(" ");
        List list=new ArrayList<>();
        for (char str2 :string.toCharArray()) {
            if(Character.isAlphabetic(str2))
            {
                list.add(str2);
            }
        }
        for (Object object : list) {
            System.out.print(object);
        }
    }
}
