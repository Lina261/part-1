import java.util.Scanner;

public class cukl1 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int a = sc.nextInt();
int b=0;
        for( int c=1; c<a; c++ ){
            b=b+c;
        }
        System.out.println("Полученная сумма равна "+ b);
    }
}
