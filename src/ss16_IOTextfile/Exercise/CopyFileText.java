package ss16_IOTextfile.Exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        String source = "src/ss16_IOTextfile/Exercise/Target/Source";
        String target = "src/ss16_IOTextfile/Exercise/Target/Target";
        readFile(source, target);
    }

    public static void readFile(String source, String target) {
        String line = null;
        int count = 0;
        try {
            FileReader fileReader = new FileReader(source);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(target);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split("");
                for (String s : arr) {
                    bufferedWriter.write(s);
                    count++;
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


