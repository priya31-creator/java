
import java.util.Arrays;
import java.util.Scanner;

public class insertsort {
    public static void main(String[] args) {
        System.out.println("enter the limit");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of an array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array is "+Arrays.toString(arr));
        for(int i=0; i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("soted array is "+Arrays.toString(arr));
        sc.close();
    }
}
