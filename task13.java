import java.util.*;
public class task13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        int w1=wordlength(word1);
        int w2=wordlength(word2);

        String fw1=word1.substring(0, w1);
        String fw2=word2.substring(0, w2);
        System.out.println(fw1);
        System.out.println(fw2);

        int length1=word1.length();
        int mid1=length1-(w1*2);
        String tw1=word1.substring(mid1+w1,length1);
        System.out.println(tw1);

        int length2=word2.length();
        int mid2=length2-(w2*2);
        String tw2=word2.substring(mid2+w2,length2);
        System.out.println(tw2);

        String key=fw2+fw1+tw1+tw2;
        System.out.println(key.toUpperCase());
        //System.out.println(tw1);
        
    }
    public static int wordlength(String word)
    {
        if((word.length()%2)==0)
        {
            int length1=word.length()/3;
            return length1;
        }
        else
        {
            int length1=word.length()/3;
            return length1;
        }
    }
}
