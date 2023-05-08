package homework.lesson4;

/*
Ввести с клавиатуры строку и число N. Вывести на экран строку N раз используя цикл while.
Пример ввода: pro 2
Пример вывода: pro pro
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type text: ");
        String str = scanner.nextLine();
        System.out.print("Type repetition count : ");
        int num = scanner.nextInt();

        int count = 0;
        while (count < num) {
            System.out.print(str + " ");
            count++;
        }
    }
}
