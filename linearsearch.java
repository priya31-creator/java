
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        System.out.println("enter the limit for an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of an arary");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter a data item u want to search");
        int item=sc.nextInt();
        int loc = -1; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == item) {
                loc = i; 
                break;   
            }
        }
        if(loc!=-1){
            System.out.println("element is found "+(loc+1));
        }
        else{
            System.out.println("element is not found");
        }

    }
}
