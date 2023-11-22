import java.util.*;
public class array_of_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count6 =0,count7=0;
        for(int i=0;i<n;i++){
            if((arr[i] == 6) && (arr[i+1] == 6)){
                count6++;
            }
            if((arr[i] == 6) && (arr[i+1] == 7)){
                count7++;
            }
        }
        System.out.println("two 6's are next to each other occured "+count6+" times");
        System.out.println("7 is the second element for "+count7+" times");
    }
}