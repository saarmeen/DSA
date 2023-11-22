import java.util.Arrays;
import java.util.Scanner;

public class seperating0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a variable for size for an array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter the elements of an array only 0 and 1");
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int countzero=0, countone=0;
        for(int i=0;i<a;i++){
            if(arr[i]==0){
                countzero++;
            }
            if(arr[i]==1){
                countone++;
            }
        }
        int[] arr1 = new int[countzero];
        int[] arr2 = new int[countone];
        for(int i=0;i<countzero;i++){
            arr1[i]=0;
        }
        for(int i=0;i<countone;i++){
            arr2[i]=1;
        }
        int pos = 0;
        for (int element : arr1) {
            arr[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            arr[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(arr));
    }
}


