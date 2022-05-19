package ss11_StackQueue.Exercise.Padindrome;

import java.util.*;

public class Padandrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu: ");
        String string = scanner.nextLine();

        //Day toan bo chuoi vao trong Stack, kieu phai la doi tuong
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        String reverseString = "";

        //Kiem tra khi stack ko rong thi dao nguoc string bang cach dung pop
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        if (string.equals(reverseString)) {
            System.out.println("String is Padandrome");
        } else {
            System.out.println("String is not Padandrome");
        }
    }
}
