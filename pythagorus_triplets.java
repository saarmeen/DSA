import java.util.Scanner;

public class pythagorus_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c && (b*b)+(c*c)==(a*a)){
            System.out.println("Right-Triangle is possible with hypotenuse "+a);
        } else if (a<b && b>c && (b*b)==(c*c)+(a*a)) {
            System.out.println("Right-Triangle is possible with hypotenuse "+b);
        } else if (a<c && b<c && (c*c)==(b*b)+(a*a)) {
            System.out.println("Right-Triangle is possible with hypotenuse "+c);
        }else{
            System.out.println("Right_triangle is not possible with the following sides "+a+" "+b+" "+c);
        }
    }
}
