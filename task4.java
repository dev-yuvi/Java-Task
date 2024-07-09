import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
            System.out.println((int)Math.pow((int)i,(int) i)/i);   
        }
    }
}
