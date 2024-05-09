package files;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        readWithBufferedReader();
    }

    private static void readWithBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/numbers.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line.toUpperCase());
        }

    }

    private static void readNumbersFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "numbers.txt"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine().replaceAll("[^0-9]", "");
            int number = Integer.parseInt(line);
            System.out.println(number);
        }
    }
}
