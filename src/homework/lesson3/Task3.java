package homework.lesson3;

/* Ввести с клавиатуры три числа, вывести на экран среднее из них. */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int thirdNumber = scanner.nextInt();
        scanner.close();

        int avg;

        if ((firstNumber >= secondNumber && firstNumber <= thirdNumber) || (firstNumber <= secondNumber && firstNumber >= thirdNumber)) {
            avg = firstNumber;
        } else if ((secondNumber >= firstNumber && secondNumber <= thirdNumber) || (secondNumber <= firstNumber && secondNumber >= thirdNumber)) {
            avg = secondNumber;
        } else {
            avg = thirdNumber;
        }
        System.out.println("Average number is: " + avg);
    }
}
