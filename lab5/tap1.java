import java.util.Scanner;

public class tap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Пароль енгізіңіз: ");
            password = sc.nextLine();
        } while (!password.equals("1234"));

        System.out.println("Қош келдіңіз!");
    }
}