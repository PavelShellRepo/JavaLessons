package homework.lesson4;

/* Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме. */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Type number: ");
            int number = scanner.nextInt();
            sum+=number;
            if (number == -1){
                System.out.println("Sum of all numbers: " + sum);
                break;
            }
        }
        scanner.close();
    }
}
