package ss16_IOTextfile.Practice;

import java.io.*;

public class Test {
    static File file = new File("src/ss16_IOTextfile/Exercise/Source/Source");

    public static void write() {
        FileWriter fileWriter = null;
        {
            try {
                fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Hello");
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

