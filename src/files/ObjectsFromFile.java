package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("files", "persons.csv");
        List<Person> personList = readPersons(file);
        System.out.println(personList);
        writeReport(personList, "files/report.data");
    }

    private static void writeReport(List<Person> persons, String reportPath) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reportPath));
        bufferedWriter.write("Number of persons: " + persons.size());
        bufferedWriter.newLine();
        for (Person person : persons) {
//            bufferedWriter.write(person.name() + " has age " + person.age() + " with position " + person.position());
            bufferedWriter.write(String.format("%s has age %d with position %s", person.name(), person.age(), person.position()));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static List<Person> readPersons(File file) throws FileNotFoundException {
        List<Person> result = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (!line.isEmpty()) {
                result.add(getPersonFromLine(line));
            }
        }
        return result;
    }

    private static Person getPersonFromLine(String line) {
        String[] tokens = line.split(",");
        int ageOrDefault = tokens.length >= 2 ? Integer.parseInt(tokens[1].replaceAll("[^0-9]", "")) : 18;
        String positionOrDefault = tokens.length >= 3 ? tokens[2] : "no job";
        return new Person(tokens[0], ageOrDefault, positionOrDefault);
    }
}
