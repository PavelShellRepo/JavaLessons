package homework.Lesson6;

/*
В методе initializeArray():
Создайте массив на 10чисел.
Считайте с консоли 10чисел и заполните ими массив.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        initializeArray();
    }

    public static void initializeArray() {
        int[] numbers = new int[10];

        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(numbers) + " ");
    }

}


