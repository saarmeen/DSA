import java.util.Scanner;

public class benjamin_bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs:-");
        int n = sc.nextInt();
        System.out.print("The bulbs which rmained toggled are:-");
        for (int i = 1; i*i <= n; i++) {
            System.out.print(i*i+" ");

        }
    }
}
