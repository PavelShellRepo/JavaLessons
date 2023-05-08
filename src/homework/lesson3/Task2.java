package homework.lesson3;

/* Ввести с клавиатуры три числа, вывести на экран минимальное из них. */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            int thirdNumber = scanner.nextInt();
            scanner.close();

            int minNumber;

            if (firstNumber < secondNumber && firstNumber < thirdNumber){
                minNumber = firstNumber;
            } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
                minNumber = secondNumber;
            } else {
                minNumber = thirdNumber;
            }
        System.out.println("Min number is: " + minNumber);
        }
    }
