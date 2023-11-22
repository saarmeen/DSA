import java.util.Stack;

public class Exp11 {
    
    public static void towerOfHanoi(int n, Stack<Integer> source, Stack<Integer> auxiliary, Stack<Integer> destination) {
        if (n == 1) {
            int disk = source.pop();
            destination.push(disk);
            System.out.println("Move disk " + disk + " from source to destination");
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        int disk = source.pop();
        destination.push(disk);
        System.out.println("Move disk " + disk + " from source to destination");

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        for (int i = n; i >= 1; i--) {
            source.push(i);
        }

        towerOfHanoi(n, source, auxiliary, destination);
    }
}
