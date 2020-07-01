import java.util.Scanner;

public class ex3 {
    static void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x и y, пожалуйста");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Результат вычисления " + result(x, y));
    }
    static double result ( double x, double y)
    {
        double sum= Math.sin(x)+Math.cos(y);
        double min = Math.cos(x)-Math.sin(y);
        return (sum/min * Math.tan(x*y));
    }
}
