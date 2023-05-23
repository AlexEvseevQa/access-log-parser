import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число №1: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите число №2: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Сумма:" + (a+b));
        System.out.println("Разность:" + (a-b));
        System.out.println("Произведение:" + (a*b));
        System.out.println("Частное:" + (double)a/b);
    }
}
