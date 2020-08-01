import java.util.Scanner;

public class ex21 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите углы треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=180-a-b;
        if(c==90){
        System.out.println("прямоугольный");
        }
        else if(c<0){
            System.out.println("Не может");
        }
        else if(c>0){
            System.out.println("Может");
        }
    }

}
