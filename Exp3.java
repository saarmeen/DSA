import java.util.Scanner;

public class Exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the size of the array:-");
        int n = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:- ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        System.out.println("the sum of the elements is  "+sum);
        for (int i = 0; i < a.length; i++) {
            if(i % 2 != 0) {
                continue;
            }

            sum1 +=a[i];
        }
        System.out.println("the sum of the alternate elements is  "+sum1);

        int max1=0;
        int max2=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] >max1){
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] >max2){
                max2 = a[i];
            }

        }
        System.out.println("the second maximum number is:- "+max2);
        System.out.println("Saarmeen(22CSU119)");
    }
}
