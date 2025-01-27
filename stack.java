
import java.util.Scanner;

public class stack {

    private static int top = -1;
    private static int size;
    private static int[] arrstack;

    static void display(){
        System.out.println("menu ");
        System.out.println("1. push operation");
        System.out.println("2. pop operation");
        System.out.println("3. overflow ");
        System.out.println("4. underlow");
        System.out.println("5. display all the element present in a stack ");
    }
    static void push(int element)
    {
         if (top==size-1)
        {
            System.out.println("stack is full ");
        }
        else{
            top++;
            arrstack[top]=element;
        }
    }
    static void pop(){
        if (top==-1){
            System.out.println("statck is empty");
        }
        else{
            
            int pop_data=arrstack[top];
            top--;
            System.out.println("popped element is"+ pop_data);
        }

    }
    static void overflow(){
        if (top==size-1)
        {
            System.out.println("stack is full");
        }
        else{
            System.out.println("stack is not full . you can enter more elements ");
        }
        

    }
    static void underflow(){
        if (top ==-1)
        {
            System.out.println("stack is in underflow condition .");
        }
        else{
            System.out.println("you can delete /pop elemnts ");
        }

    }
    static void show(){
        if(top==-1)
        {
            System.out.println("stack is empty");

        }
        else{
            System.out.println("stack elements are ");
            for (int i=0; i<=top;i++)
            {
                System.out.println(arrstack[i]);
            }
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("enter the size of an stack");
        size = sc.nextInt();
        arrstack=new int[size];
        boolean continueprogram =true;

        while (continueprogram) {
            display();
            System.out.println("enter your choice from 1-5");
            choice=sc.nextInt(); 
            
        
        switch (choice) {
            case 1:
                System.out.println("you selected :push operation. So enter a element for  push operation ");
                int element=sc.nextInt();
                push(element);

            break;
            case 2 :
                System.out.println("you selected :pop opeartion ");
                pop();
            break;
            case 3 :
                System.out.println("you selected overflow ");
                overflow();
            break;
            case 4 :
                System.out.println("you selected underflow");
                underflow();
            break;
            case 5 :
                System.out.println("you selected display all the elements in stack ");
                show();
            break;
            default:
            System.out.println("invalid choice .please try again ");
            break;
            
        }
        System.out.println(" do you want to continuee yes or no");
        String response= sc.next().trim().toLowerCase();
        if (!response.equals("yes"))
        {
            continueprogram=false;
            System.out.println("existing the program goodbye");
        }
    }

    }
    
}
