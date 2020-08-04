import java.util.Scanner;

public class ex23 {
    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки C");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(kord(x,y));
        }


        static boolean kord(int a,int b){
        int x1=2;int x2=4; int y1=1; int y2=2;
        return ((a-x1)/(x2-x1)==(b-y1)/(y2-y1));
        }
}
