import java.util.*;

public class Exp9 {

    public static boolean ParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>();


        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();


                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression:- ");
        str = sc.nextLine();
        System.out.print(str);
        if (ParenthesesBalanced(str)) {
            System.out.println(" :-Parentheses Balanced");
        } else {
            System.out.println(" :-Parentheses Not Balanced");
        }
        System.out.println("Saarmeen");
    }
}
