import java.util.Scanner;

public class ex25 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double a = sc.nextDouble();
        System.out.println("Результат "+ f(a));
    }

        static double f(double x) {
        if (x <= 3){
            return Math.pow(x, 2.0) - 3*x + 9;
        } else {
            return 1/(Math.pow(x, 3.0) + 6);
        }
    }
}
