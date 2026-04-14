import java.util.Scanner;

public class tap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Math.abs(sc.nextInt());

        int count=0;
        while(n>0){
            n/=10;
            count++;
        }

        System.out.println("Цифр саны = "+count);
    }
}