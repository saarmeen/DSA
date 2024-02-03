import java.util.Scanner;

public class rotate_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        System.out.print("Enter number of rotations:-");
        int k = sc.nextInt();

        //to count number of digits
        int temp = n;
        int nod = 0;
        while(temp > 0){
            temp = temp / 10;
            nod++;
        }

        //to handle special cases
        k = k % nod; // if there is a 5 digits number then the multiples of 5 will produce the same number as the original so
        // we"ll count only those number that are out the multiple eg 11 rotations == 1 number rotation
        if(k < 0){
            k = k + nod; // to handle negative rotations eg -2 rotations == +3 rotations
        }

        int div = 1;
        int multi = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            }else {
                multi = multi * 10;
            }
        }

        int q = n / div;
        int rem = n % div;
        int rot = rem * multi +q;
        System.out.println("The rotated number is "+rot);
    }
}
