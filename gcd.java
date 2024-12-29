package java;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int gcd =0;
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int a=Math.min(n1,n2);
        for (int i=1; i<=a;i++)
        {
            if (n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
