import java.util.Scanner;

public class ex2 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа а b c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Результат выполнения " + result(a, b, c));
    }
    static double result (double a, double b, double c)
    {
        return ((b+Math.pow((Math.pow(b, 2)+ 4*a*c), 0.5))/2*a - Math.pow(a, 3)*c + Math.pow(b, -2));
    }
}
