package homework.lesson3;

/* Ввести с клавиатуры два числа, вывести на экран максимальное из них. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("max is " + firstNumber);
        } else {
            System.out.println("max is " + secondNumber);
        }

    }
}