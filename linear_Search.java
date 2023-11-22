import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements of an array:-");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:-");
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (x == arr[i]) {
                System.out.println("Element is present at "+(i+1));
            }
        }

        System.out.println("Saarmeen(22CSU119)");
    }
}
