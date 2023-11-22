import java.util.*;
class arratmedian{
    public void median(int[] arr, int n){
        int median=0;
        Arrays.sort(arr);
        median = arr[arr.length/2];
        System.out.println("median of an array is  "+median);
    }
}
public class median_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of an array");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arratmedian am = new arratmedian();
        am.median(arr,n);
    }
}