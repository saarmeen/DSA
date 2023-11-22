
import java.util.Scanner;

public class finding_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:-");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find the index of:-");
        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (x == arr[i]) {
                System.out.println("the idnex of the element is:- "+i);
            }
        }
        System.out.println("Saarmeen(22CSU119)");
    }
}
