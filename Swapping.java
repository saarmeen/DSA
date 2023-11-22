import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first=0, last=0;
        System.out.println("Enter the size of an array:-");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter the elements of an array:-");
        for(int i=0; i<a;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<a;i++){
            if(i==0){
                first = arr[i];
            }
            if(i==a-1){
                last = arr[i];
            }
        }

        for(int i=0; i<a;i++){
            if(i==0){
                arr[i] = last;
            }
            if(i==a-1){
                arr[i] = first;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println("Saarmeen(22CSU119)");
    }
}
