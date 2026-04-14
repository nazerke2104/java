import java.io.*;
import java.util.Scanner;

public class Code {

    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Студент қосу");
            System.out.println("2. Барлық студенттерді көру");
            System.out.println("3. Шығу");
            System.out.print("Таңдау: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // buffer тазалау

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    readStudents();
                    break;
                case 3:
                    System.out.println("Бағдарлама аяқталды.");
                    break;
                default:
                    System.out.println("Қате таңдау!");
            }

        } while (choice != 3);

        scanner.close();
    }

    // 📌 Студент қосу (файлға жазу)
    public static void addStudent(Scanner scanner) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true)); // append режим

            System.out.print("Студент аты: ");
            String name = scanner.nextLine();

            System.out.print("Жасы: ");
            String age = scanner.nextLine();

            writer.write(name + "," + age);
            writer.newLine();
            writer.close();

            System.out.println("Студент сақталды!");
        } catch (IOException e) {
            System.out.println("Қате: " + e.getMessage());
        }
    }

    // 📌 Файлдан оқу
    public static void readStudents() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            System.out.println("\n--- Студенттер тізімі ---");

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Аты: " + data[0] + " | Жасы: " + data[1]);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Файл бос немесе табылмады!");
        }
    }
}