import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        int nod = 0;
        int temp = n;
        while(temp !=0 ){
            temp = temp/10;
            nod++;
        }

        int count = 0;
        int div = (int)Math.pow(10,nod-1);
        while(div !=0 ){
            int q = n/div;
            //System.out.println(q);

            n = n % div;
            div = div / 10;
            count++;
        }
        System.out.println("Number of digits are:- "+count);
    }
}
