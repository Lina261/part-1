import java.util.Scanner;

public class ex1 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа а b c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Результат выполнения " + zahod(a, b, c));
    }

     static double zahod(int a, int b, int c){
        return ((a-3)*b)/2+c;
    };
}
