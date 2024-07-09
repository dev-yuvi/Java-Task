import java.util.*;
public class task15 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n-1;
      for(int i=1;i<n;i++)
      {
         for(int j=0;j<a;j++)
         {
            System.out.print(" ");
         }
         a--;
         for(int k=a+1;k<n;k++)
         {  
            System.out.print(k==n-1?(i):(i)+"_");
         }
         System.out.println();
      }
     
   }
}