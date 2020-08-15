import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    boolean flag = true;
    while (flag) {
        System.out.println("ЗАДАНИЯ ЧАСТЬ 1");
        System.out.println("Какое задание нужно выполнить?\n" +
                "Линейные программы 1-5\n" +
                "Ветвления 6-10\n" +
                "Циклы 11-18\n"
        );
        int a=sc.nextInt();
        switch (a){
            case 0 : flag=false;
                break;
            case 1 : ex1.run();
                break;
            case 2 : ex2.run();
                break;
            case 3 : ex3.run();
                break;
            case 4 : ex4.run();
                break;
            case 5:ex5.run();
            break;
            case 6 :ex21.run();
            break;
            case 7 :ex22.run();
            break;
            case 8:ex23.run();
            break;
            case 9: ex24.run();
            break;
            case 10:ex25.run();
            break;
            case 11:cukl1.run();
            break;
            case 12:cukl2.run();
            break;
            case 13:cukl3.run();
                break;
            case 14:cukl4.run();
                break;
            case 15:cukl5.run();
                break;
            case 16:cukl6.run();
                break;
            case 17:cukl7.run();
                break;
            case 18:cukl8.run();
                break;
            default: System.out.println("Попробуйте снова");
                break;
        }
    }
    }
}
