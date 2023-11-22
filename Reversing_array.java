import java.util.Scanner;

public class Reversing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array:-");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("normally printed:-");
        for (int i = 0; i <= 9; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("reversed printed:-");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSaarmeen(22CSU119)");
    }
}
