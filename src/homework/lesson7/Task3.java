package homework.lesson7;

/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int[] dest1 = new int[5];
        int[] dest2 = new int[5];

        System.out.println("Enter 10 numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

       System.arraycopy(numbers, 0, dest1, 0, 5);
       System.arraycopy(numbers, 5, dest2, 0, 5);

        for (int j : dest2) {
            System.out.println(j);
        }
    }
}
