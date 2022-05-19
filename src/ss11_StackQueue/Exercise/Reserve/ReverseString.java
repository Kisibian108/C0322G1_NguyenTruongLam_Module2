package ss11_StackQueue.Exercise.Reserve;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println("Dao nguoc chuoi");
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}