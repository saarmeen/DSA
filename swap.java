import java.util.*;
class swap_elements{
    public void swapPairs(int[] arr, int n){
        for (int x = 0; x < arr.length - 1; x = x + 2) {
            int temp = arr[x];
            arr[x] = arr[x + 1];
            arr[x + 1] = temp;
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of an array");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        swap_elements sp = new swap_elements();
        sp.swapPairs(arr,n);
    }
}