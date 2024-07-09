
import java.util.*;;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<n;k++)
            {
                System.out.print(k==n-1?"*":"*_");
            }
            System.out.println();
        }
    }
}
