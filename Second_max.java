import java.util.Scanner;

public class Second_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:-");
        int a = sc.nextInt();
        int arr[]= new int[a];
        System.out.println("Enter the elements of the array:-");
        for (int i = 0; i <a ; i++) {
             arr[i]=sc.nextInt();
        }
        int max1=0;
        int max2=0;
        for (int i = 0; i < a; i++) {
            if(arr[i] >max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] >max2){
                max2 = arr[i];
            }

        }
        System.out.println("the second maximum number is:- "+max2);
        System.out.println("Saarmeen(22CSU119)");
    }
}
