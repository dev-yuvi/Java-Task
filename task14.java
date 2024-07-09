import java.util.*;
public class task14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name");
        String First_Name=sc.nextLine();
        System.out.println("Enter Last Name");
        String Last_Name=sc.nextLine();
        int First=First_Name.length();
        int Last=Last_Name.length();
        System.out.println("Enter PIN:");
        int pin=sc.nextInt();
        String pin1=String.valueOf(pin);
        char letter;
        if(Last<First)
        {
           letter =Last_Name.charAt(Last-1);
            //System.out.print(letter);
        }
        else
        {
            letter =First_Name.charAt(First-1);
            //System.out.print(letter);
        }
       ArrayList arr=new ArrayList<>();
        while (pin>0) 
        {
            int temp=pin%10;
           arr.add(temp);
            pin/=10;
        }
        if(Last<First)
        {
            String User_id=letter+First_Name+arr.get(0)+arr.get(pin1.length()-1);
            String result = "";
            for (char c : User_id.toCharArray()) 
            {
                if (Character.isUpperCase(c)) 
                {
                    result += Character.toLowerCase(c);
                } 
                else if (Character.isLowerCase(c)) 
                {
                    result += Character.toUpperCase(c);
                } 
                else 
                {
                    result += c;
                }
            }
            System.out.println(result); 
        }
        else
        {
            String User_id=letter+Last_Name+arr.get(0)+arr.get(pin1.length()-1);
            String result="";
            for (char c : User_id.toCharArray()) 
            {
                if(Character.isUpperCase(c))
                {
                    result+=Character.toLowerCase(c);
                }    
                else if(Character.isLowerCase(c))
                {
                    result+=Character.toUpperCase(c);
                }
                else
                {
                    result+=c;
                }
            }
            System.out.println(result);
        }
        
    }
}
