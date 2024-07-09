import java.util.*;
import java.util.Collection;
public class task2 {
    private static char[] sum3;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int cout=str.length();
        int cout1=0;
        Long phone=Long.parseLong(str);
        //long phone=sc.nextInt();
        int arr[]=new int[10];
        int arr1[]=new int[10];
        long temp;
        long sum1=0;
        long sum2;
        int rev=0;
        for(int i=0;i<10;i++)
        {
            if(phone>0)
            {   
                temp=phone%10;
                rev=(int) (rev*10+temp);
                //arr1.add((int)temp);
                arr[i]=(int) temp;
                phone/=10;
            }
        }
        System.out.println(rev);
        for(int i=arr.length-1,k=0;i>=0;i--)
        {
            arr1[k]=arr[i];
            System.out.print(arr1[k]+" ");
            k++;
        }
        System.out.println();
        for(int i=0;i<cout;i++)
        {
            int temp1=arr1[i];
            sum1=sum1+temp1;
            cout1++;
            if(sum1%2==0)
            {
                System.out.print(sum1+" ");
                break;
            }

        }
        
    }
}
