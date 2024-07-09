import java.util.*;;
public class task6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input 1:");
        int input1=sc.nextInt();
        System.out.println("Enter input 2:");
        int input2=sc.nextInt();
        System.out.println("Enter input 3:");
        int input3=sc.nextInt();
        System.out.println(large(input1,input2, input3));
    }
    public static int large(int input1,int input2,int input3)
    {   
        int large1=0;
        int large2=0;
        while(input1>0) 
        {
          int temp= input1%10;
          if(temp>large1)
          {
            large2=large1;
            large1=temp;

          }
          else if(temp>large2)
          {
            large2=temp;
            
          }
          input1/=10;
        }
        int large3=0;
        int large4=0;
    while(input2>0) 
        {
          int temp= input2%10;
          if(temp>large3)
          {
            large4=large3;
            large3=temp;

          }
          else if(temp>large4)
          {
            large4=temp;
            
          }
          input2/=10;
        }
        int large5=0;
        int large6=0;
        while(input3>0) 
        {
          int temp= input3%10;
          if(temp>large5)
          {
            large6=large5;
            large5=temp;

          }
          else if(temp>large6)
          {
            large6=temp;
            
          }
          input3/=10;
        }
        return large1+large2+large3+large4+large5+large6;
    }
    
}
