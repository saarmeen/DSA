import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the elements of the array:-");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            
        }
        for (int i = 0; i < 5; i++) {
            if (i != arr[i]) {
                System.out.println("The missing elemnt is "+i);
                break;
                
            }
            
        }
        System.out.println("Saarmeen(22CSU119)");
    }
}
