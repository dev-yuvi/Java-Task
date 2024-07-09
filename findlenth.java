public class findlenth {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,11,12,13};
        int count=0;
        int count1=0;
        int count2=0;
        for(int i:arr)
        {
            count++;
        }
        System.out.println(count);
        
        for(int num: arr)
        {
            if(num%2 ==0)
            {
                System.out.print(num+" ");
                count1++;
            }
        }
        System.out.println(" ");
        System.out.println(count1);
        for(int num:arr)
        {
            if(num%2 !=0)
            {
                System.out.print(num+" ");
                count2++;
            }
        }
        System.out.println("");
        System.out.println(count2);
       
    }
}

