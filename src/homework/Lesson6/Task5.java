package homework.Lesson6;

/* Ввести 5 строк с клавиатуры и записать их в массив */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String strings[] = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type five strings: ");
        for (int i = 0; i < 5; i++) {
            strings[i] = scanner.nextLine();
        }

        System.out.println("Entered strings: ");
        for (String str: strings){
            System.out.print(str + " ");
        }
    }
}
