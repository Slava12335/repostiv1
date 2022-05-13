import java.util.Scanner;
import java.lang.Math;
class Dz2 {
    public static void main(String[] args) {
        Number();
    }
    public static void Number() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b = (int) (Math.random() * 10);
        int c;
        System.out.println("Загадано число от 0 до 9, угадайте это число с трёх попыток.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = sc.nextInt();
            if (a < b) {
                System.out.println("Число больше!");
            }
            if (a > b) {
                System.out.println("Число меньше!");
            }
            if (a == b) {
                System.out.println("Вы угадали! Повторить игру еще раз? 1 – да 0 – нет");
                c = sc.nextInt();
                if (c == 1) Number();
                else {
                    System.out.println("Всего хорошего");
                    break;
                }
            }
        }
        System.out.println("Вы не угадали. Повторить игру еще раз? 1 – да / 0 – нет");
        c = sc.nextInt();
        if (c == 1) Number();
        else {
            System.out.println("Всего хорошего");
        }
    }
}