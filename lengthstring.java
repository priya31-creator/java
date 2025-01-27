
import java.util.Scanner;

public class lengthstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sting");
        String s1 = sc.next();
        int index =0;
        for (char c : s1.toCharArray())
        {
            index++;
        }


        System.out.println("length of an string is "+index);


    }
    
}
