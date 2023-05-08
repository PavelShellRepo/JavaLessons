package homework.lesson3;

/* Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то увеличить его на 10. Вывести результат на экран. */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        if(number > 0){
            number*=2;
            System.out.println("result *2: " + number);
        } else if (number <0) {
            number+=10;
            System.out.println("result +10: " + number);
        }
    }
}
