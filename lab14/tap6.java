import java.util.Scanner;

public class tap6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Math.abs(sc.nextInt());

        int count=0;

        while(n>0){
            if((n%10)%2==0)
                count++;
            n/=10;
        }

        System.out.println("Жұп цифр саны = "+count);
    }
}