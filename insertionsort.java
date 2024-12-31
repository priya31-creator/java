

import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        System.out.println("enter the limit for array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the elements of an array");
        for (int i= 0; i<n;i++)
        {
                arr[i]=sc.nextInt();
        }
        System.out.println("original array" +Arrays.toString(arr));
        for (int i=n-1;i>=1;i--){
            for (int j=0;j<=i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array" +Arrays.toString(arr));

    }
    
}
