import java.util.Random;

public class tap7 {
    public static void main(String[] args) {

        Random r=new Random();
        int num;

        do{
            num=r.nextInt(10);
            System.out.println(num);
        }while(num!=0);
    }
}