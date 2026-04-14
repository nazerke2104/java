import java.util.Scanner;

public class tap10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n;
        int min=Integer.MAX_VALUE;

        while(true){
            n=sc.nextInt();
            if(n==0) break;

            if(n<min) min=n;
        }

        System.out.println("Min = "+min);
    }
}