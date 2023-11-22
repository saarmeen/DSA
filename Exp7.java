import java.util.*;
public class Exp7 {
    public static void main(String[] args) {
        System.out.println("Saarmeen-");
        Scanner sc = new Scanner(System.in);
        int[] stack= new int[100];
        int n, top=-1;
        System.out.println("enter the size of stack: ");
        n = sc.nextInt();
        String st = "n";
        String str ="";
        do{
            System.out.println("enter Y or N");
            str = sc.next();
            System.out.println("1. push\n2. pop\n3. peek");
            System.out.println("enter your choice ");
            int a = sc.nextInt();
            switch (a) {
                case 1:{
                    if(top == n){
                        System.out.println("can't implement push function  ");
                    }
                    else{
                        System.out.println("enter the element ");
                        int ele = sc.nextInt();
                        top = top+1;
                        stack[top]= ele;
                    }
                    System.out.println("Printing stack elements .....");
                    for(int i = top; i>=0;i--)
                    {
                        System.out.println(stack[i]);
                    }
                }


                break;

                case 2:{
                    if(top == -1){
                        System.out.println("can't perform operation");
                    }
                    else{
                        top = top-1;
                    }
                    System.out.println("Printing stack elements .....");
                    for(int i = top; i>=0;i--)
                    {
                        System.out.println(stack[i]);
                    }
                }

                break;
                case 3:{
                    if(top == -1){
                        System.out.println("underflow");
                    }
                    else{
                        System.out.println("element at top of stack is "+stack[top]);
                    }
                    System.out.println("Printing stack elements .....");
                    for(int i = top; i>=0;i--)
                    {
                        System.out.println(stack[i]);
                    }
                }

                break;

                default:{
                }
                break;
            }
        }
        while(!str.equals(st));

            }
}
