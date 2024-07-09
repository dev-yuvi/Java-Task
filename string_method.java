public class string_method {
    public static void main(String[] args) {
        //char charAt(int index)
        String str1="My Name Yuvi";
        char c=str1.charAt(3);
        System.out.println(c);

        //boolean equals(Object obj)
        String str2="Yuvi";
        String str3=str2;
        if(str2.equals(str3))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        // boolean equalsIgnoreCase(String string)
        String str4=str2.toUpperCase();  
        if(str2.equalsIgnoreCase(str4))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        // int compareToIgnoreCase(String string)
        String str5="yuvi";
        int result=str2.compareToIgnoreCase(str5);
        System.out.println(result);
        //boolean startsWith(String prefix, int offset)
        String str6="My brother Karthick";
        boolean value=str6.startsWith("yuvi",3);
        System.out.println(value);
        boolean value1=str6.startsWith("My");
        System.out.println(value1);
        boolean value3=str6.endsWith("Karthick");
        System.out.println(value3);
        // hash code of the Sttring
        int value4=str6.hashCode();
        System.out.println(value4);
        //index of the string
        int index=str6.indexOf("b");
        System.out.println(index);
        int index1=str6.indexOf("b",3);
        System.out.println(index1);
        int index3=str6.lastIndexOf("k");
        System.out.println(index3);
        int index4=str6.lastIndexOf("y", 1);
        System.out.println(index4);
        int value5=str6.indexOf("K");
        System.out.println(value5);
        int value6=str6.lastIndexOf("k");
        System.out.println(value6);
        String str7=str6.substring(2);
        System.out.println(str7);
        String str8=str6.substring(2, 10);
        System.out.println(str8);
        String str9=str6.concat(str8);
        System.out.println(str9);
        str8=str8.replace("b", "B");
        System.out.println(str8);
        boolean value7=str6.contains("b");
        System.out.println(value7);
        str8=str8.toUpperCase();
        System.out.println(str8);
    }
    
}
