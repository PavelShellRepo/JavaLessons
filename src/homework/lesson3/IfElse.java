package test.lesson3;
/* Ввести с клавиатуры два числа, вывести на экран максимальное из них. */
/* Ввести с клавиатуры три числа, вывести на экран минимальное из них. */
/* Ввести с клавиатуры три числа, вывести на экран среднее из них. */
/* Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и. */
/* Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то увеличить его на 10. Вывести результат на экран. */
/* Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода. */
/* Реализовать метод closeToFive. Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6. Если оба числа на равной длине к 5, то вывести на экран любое из них. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
    closeToFive(88,32);

    }
    public static int getMaxNumber() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number: ");
        String input = reader.readLine();
        int firstNumber = Integer.parseInt(input);
        System.out.println("Enter second number: ");
        String input2 = reader.readLine();
        int secondNumber = Integer.parseInt(input2);

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
        public static int getMinNumber() throws IOException{
            int minNumber;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number: ");
            String input = reader.readLine();
            int firstNumber = Integer.parseInt(input);
            System.out.println("Enter second number: ");
            String input2 = reader.readLine();
            int secondNumber = Integer.parseInt(input2);
            System.out.println("Enter second number: ");
            String input3 = reader.readLine();
            int thirdNumber = Integer.parseInt(input3);
            reader.close();

            if (firstNumber < secondNumber && firstNumber < thirdNumber){
               minNumber = firstNumber;
        } else minNumber = Math.min(secondNumber, thirdNumber);
            return minNumber;
        }

       public static int getAvgNumber() throws IOException{
            int avg;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter first number: ");
           String input = reader.readLine();
           int firstNumber = Integer.parseInt(input);
           System.out.println("Enter second number: ");
           String input2 = reader.readLine();
           int secondNumber = Integer.parseInt(input2);
           System.out.println("Enter second number: ");
           String input3 = reader.readLine();
           int thirdNumber = Integer.parseInt(input3);
           reader.close();

           if ((firstNumber >= secondNumber && firstNumber <= thirdNumber) || (firstNumber <= secondNumber && firstNumber >= thirdNumber)) {
               avg = firstNumber;
           } else if ((secondNumber >= firstNumber && secondNumber <= thirdNumber) || (secondNumber <= firstNumber && secondNumber >= thirdNumber)) {
               avg = secondNumber;
           } else {
               avg = thirdNumber;
           }
           return avg;
       }

       public static void compare(int a){
        if (a < 5){
            System.out.println("menshe 5");
        } else if (a > 5) {
            System.out.println("bolshe 5");
        } else if (a == 5) {
            System.out.println("ravno 5");
        }

       }

       public static void checkInterval (int a){
        if (a >= 20 && a <= 50) {
            System.out.println("Число а содержится в интервале.");
        } else {
            System.out.println("Число а NE содержится в интервале.");
        }
       }
    public static void closeToFive(int a, int b) {
        int diffA = Math.abs(5 - a);
        int diffB = Math.abs(5 - b);

        if (diffA < diffB) {
            System.out.println("Ближайшее к 5 число: " + a);
        } else if (diffB < diffA) {
            System.out.println("Ближайшее к 5 число: " + b);
        } else {
            System.out.println("Ближайшее к 5 число: " + a + " или " + b);
        }
       }
}
