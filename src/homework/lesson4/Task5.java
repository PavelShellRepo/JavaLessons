package homework.lesson4;

/*
Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        Пример:
        m=2, n=4
        8888
        8888
*/
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type m: ");
        int m = scanner.nextInt();
        System.out.print("Type n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
