import java.util.Scanner;

public class tap9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String pass=sc.nextLine();

        if(pass.length()>=6)
            System.out.println("OK");
        else
            System.out.println("Too short");
    }
}