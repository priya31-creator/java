package java;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("the factors of " + n);
        /*for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(" "+i );
            }
        }*/
        System.out.println((int)Math.sqrt(n));
        for (int i =1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                if((n/i )!=0)
                {
                    System.out.println(n/i);
                }
            }
            
        }
    }
}
