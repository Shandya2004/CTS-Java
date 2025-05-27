import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=90 && a<=100){
            System.out.println("A");
        }
        else if(a>=80 && a<90){
            System.out.println("B");
        }
        else if(a>=70 && a<80){
            System.out.println("C");
        }
        else if(a>=60 && a<70){
            System.out.println("D");
        }
        else if(a<60){
            System.err.println("F");
        }
    }
}
