package Array.Exercise;

import java.sql.Array;
import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = i;
            }
        }

        for(int j =index; j < array.length -1; j++){
            array[j] = array[j+1];
        }
        array[array.length-1] = 0;
        System.out.println(Arrays.toString(array));
    }
}

