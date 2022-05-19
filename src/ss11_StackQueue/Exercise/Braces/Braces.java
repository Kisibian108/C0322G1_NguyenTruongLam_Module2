package ss11_StackQueue.Exercise.Braces;

import java.util.Scanner;
import java.util.Stack;

public class Braces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc:");
        String expression = scanner.nextLine();
        boolean flag = false;

        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                stack.push('(');
            } else if (expression.charAt(i) == ')') {
                if (stack.empty()) {
                    flag = true;
                }
                stack.pop();
            }
        }
        if (flag || !stack.empty()) {
            System.out.println("Sai");
        } else {
            System.out.println("Dung");
        }
    }
}
