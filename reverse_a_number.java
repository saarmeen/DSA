import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        int temp = 0;
        int rem = 0;

        while(n!=0){
            temp = n % 10;
            n = n / 10;

            rem = rem*10 + temp;

        }
        System.out.println(rem);
    }
}
