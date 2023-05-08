package homework.lesson3;

/* Реализовать метод closeToFive. Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
Если оба числа на равной длине к 5, то вывести на экран любое из них. */


public class Task7 {
    public static void main(String[] args) {
        closeToFive(8,3);
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
