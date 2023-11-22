import java.sql.SQLOutput;
import java.util.Random;

public class Exp2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] arr = new int[10];
        System.out.print("The elements of the original array is:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.print(arr[i]+"\t");
        }
        System.out.println(" ");


        System.out.print("Every element at even index:-");
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println();


        System.out.print("Every odd element is:- ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println();


        System.out.print("The array in reverse order is:- ");
        for (int i = (arr.length-1); i > 0 ; i--) {
            System.out.print(arr[i]+"\t");;
        }
        System.out.println();


        System.out.println("The first element is "+arr[0]+" and the last element is "+arr[9]);

        System.out.println("Saarmeen(22CSU119)");
    }
}
