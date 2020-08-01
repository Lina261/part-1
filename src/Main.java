import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    boolean flag = true;
    while (flag) {
        System.out.println("Какое задание нужно выполнить?");
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
            default: System.out.println("Попробуйте снова");
                break;
        }
    }
    }
}
