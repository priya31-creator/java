import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter a sting");
       String s1 = sc.next();
       String s2 = sc.next();
       char[] chararr1=s1.toCharArray();
       char[] chararr2=s2.toCharArray();
       char[] result=new char[chararr1.length+chararr2.length+1];
       int i=0;
       for(char c : chararr1)
       {
            result[i++]=c;
       }

       result[i++]=' ';
       for(char c : chararr2)
       {
            result[i++]=c;
       }
       String result1 = new String(result);
       System.out.println("concatenation of string "+ result1);






         
    }
    
}
