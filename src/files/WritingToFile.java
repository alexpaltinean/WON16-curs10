package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", true));
        writer.write("this is under qwertyuiop");
        writer.newLine();
        writer.flush();
    }
}
