import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr =new int[n];
        System.out.println("enter the elements of an array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("original array is "+Arrays.toString(arr));
        for (int i=0;i<=n-2;i++)
        {
            int min=i;
            for (int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            swap(arr, min, i);
        }
        System.out.println("sorted array"+Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}