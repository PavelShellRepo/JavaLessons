package homework.lesson8;

/*
Создать массив на 5 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr [0];
        int min = arr [0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);
    }
}
