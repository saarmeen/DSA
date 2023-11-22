import java.util.*;

class Exp1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n = inp.nextInt();
        int i, sum = 0;
        int arr[] = new int[n];

        System.out.print("\n Enter the values: ");
        for (i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int max_element = arr[0], min_element = arr[0];

        for (i = 0; i < n; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
            }

            if (arr[i] < min_element) {
                min_element = arr[i];
            }
        }


        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);

        int difference = max_element - min_element;
        System.out.println("\nThe difference is:- "+difference);
    }
}