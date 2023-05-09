package homework.Lesson6;

/* Ввести 5 чисел с клавиатуры и записать их в массив. Вывести содержимое массива в консоль */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type five numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Entered numbers: ");
        for (int n:arr){
            System.out.print(n + " * " );
        }
    }
}
