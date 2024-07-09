import java.util.*;
public class task3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int cout1=0;
        Long phone=Long.parseLong(str);
        long temp;
        long sum1=0;
        long sum2=0;
        int rev=0;
        for(int i=0;i<10;i++)
        {
            if(phone>0)
            {   
                temp=phone%10;
                rev=(int) (rev*10+temp);
                //arr1.add((int)temp);
                phone/=10;
            }
        }
        System.out.println(rev);
        while (rev>0) {
           int temp1=rev%10;
            sum1=sum1+temp1;
            if(sum1%2==0)
            {
                System.out.println(sum1);
                break;
            }
            //arr1.add((int)temp);
            rev/=10;  
        }
        System.out.println(rev);
        while (rev>1) {
            int temp2=rev%10;
            sum2=sum2+temp2;
            if(sum2%2==0)
            {
                System.out.println(sum2);
            }
            else if(sum2%2==1)
            {
                sum2=sum2+temp2;
            }
            rev/=10;
        }
    }
}
