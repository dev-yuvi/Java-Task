import java.util.*;
public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Decimal Number:");
        int decimal=sc.nextInt();
        List<Integer> al=new ArrayList<>();
        while (decimal>0) 
        {
            al.add(decimal%2);
            decimal/=2;
        }
        for (Integer integer : al) {
            System.out.print(integer);
        }
        System.out.println();
        Collections.sort(al);
        for (Integer integer : al) {
            System.out.print(integer);
        }
        System.out.println();
        int val=0;
        for(int i=al.size()-1,j=0;i>=0;i--)
        { 
          val+=(int) (al.get(i)*Math.pow(2, j));
          j++;
        }
        System.out.println(val);
    }  
}
