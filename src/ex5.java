import java.util.Scanner;

public class ex5 {
    static void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, пожалуйста");
        int x = sc.nextInt();
       func(x);
    }
    static void func(int x)
    {
       int sec=(x%3600)%60;
       int minutes=(x%3600)/60;
        int hours=x/3600;

        System.out.println(hours +"ч "+ minutes+"мин "+sec+"сек");
    }
}
