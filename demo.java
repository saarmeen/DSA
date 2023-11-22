import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add:-");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array:-");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position to insert at : ");
        int position = sc.nextInt();

        if(position == n){
            System.out.println("Insertion is not possible");
        }
        else{
            for(int i=0; i<=position; i++ ){
                arr[i]= element;
            }

            for(int i=0; i<=position; i++){
                arr[n+1] = arr[i];
            }
        }
        System.out.println("After array insertion:-");
        for(int num : arr){
            System.out.println(num+" ");
        }
    }
}