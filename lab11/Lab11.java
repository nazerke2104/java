import java.util.*;
import java.util.InputMismatchException;

public class Lab11 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            try {
                menu();

                int choice = sc.nextInt();

                if (choice == 0) break;

                if (choice == 7) {
                    clearScreen();
                    continue;
                }

                if (choice == 10) {
                    expressionCalculator();
                    continue;
                }

                System.out.print("a = ");
                double a = sc.nextDouble();

                double b = 0;

                if (choice != 2 && choice != 9)
                {
                    System.out.print("b = ");
                    b = sc.nextDouble();
                }

                double result = 0;

                switch (choice) {

                    case 1:
                        result = a + b;
                        break;

                    case 2:
                        result = Math.sqrt(a);
                        break;

                    case 3:
                        result = a - b;
                        break;

                    case 4:
                        result = a * b;
                        break;

                    case 5:
                        result = a / b;
                        break;

                    case 6:
                        result = Math.pow(a, b);
                        break;

                    case 8:
                        result = a * b / 100;
                        break;

                    case 9:
                        engineering(a);
                        continue;
                }

                System.out.println("Result = " + result);
                history.add(a + " op " + b + " = " + result);

                showHistory();

            } catch (InputMismatchException e) {
                System.out.println("Қате енгізу!");
                sc.nextLine();
            }
        }
    }

    static void menu() {
        System.out.println("\n==== CALCULATOR ====");
        System.out.println("1 – Қосу");
        System.out.println("2 – Квадрат түбір");
        System.out.println("3 – Азайту");
        System.out.println("4 – Көбейту");
        System.out.println("5 – Бөлу");
        System.out.println("6 – Дәреже x^y");
        System.out.println("7 – Экранды тазалау");
        System.out.println("8 – Процент табу");
        System.out.println("9 – Инженерлік функция");
        System.out.println("10 – Өрнек есептеу");
        System.out.println("0 – Шығу");
        System.out.print("Таңдау: ");
    }

    // ===== HISTORY =====
    static void showHistory() {
        System.out.println("\n--- History ---");
        for (String s : history)
            System.out.println(s);
    }

    // ===== CLEAR SCREEN =====
    static void clearScreen() {
        for (int i = 0; i < 30; i++)
            System.out.println();
    }

    // ===== ENGINEERING =====
    static void engineering(double a) {

        System.out.println("1 - sin");
        System.out.println("2 - cos");
        System.out.println("3 - tan");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println(Math.sin(a));
                break;
            case 2:
                System.out.println(Math.cos(a));
                break;
            case 3:
                System.out.println(Math.tan(a));
                break;
        }
    }

    // ===== EXPRESSION PARSER =====
    static void expressionCalculator() {

        sc.nextLine();
        System.out.print("Өрнек енгіз: ");
        String exp = sc.nextLine();

        try {
            String[] parts = exp.split(" ");

            double a = Double.parseDouble(parts[0]);
            String op = parts[1];
            double b = Double.parseDouble(parts[2]);

            double result = 0;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
            }

            System.out.println("Result = " + result);

        } catch (Exception e) {
            System.out.println("Қате өрнек!");
        }
    }
}