import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+a+"="+i*a);
        }
    }
}
