package ss11_StackQueue.Exercise.Reserve;

import java.util.Arrays;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
