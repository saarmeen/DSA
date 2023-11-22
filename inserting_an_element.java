import java.util.Scanner;

public class inserting_an_element {
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

        int[] newArray = new int[11];

        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }
        newArray[position] = element;

        for (int i = position; i < 10; i++) {
            newArray[i + 1] = arr[i];
        }
        System.out.println("Array after insertion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nSaarmeen(22CSU119)");

    }
}
