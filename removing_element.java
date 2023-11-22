import java.util.Scanner;

public class removing_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array:-");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to remove: ");
        int elementToRemove = sc.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }if (indexToRemove == -1) {
            System.out.println("Element not found in the array.");
        }else {

            int[] newArray = new int[9];


            for (int i = 0; i < indexToRemove; i++) {
                newArray[i] = arr[i];
            }
            System.out.println("Array after removal:");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nSaarmeen(22CSU119)");

    }
}
