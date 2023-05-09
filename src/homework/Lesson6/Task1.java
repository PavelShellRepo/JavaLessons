package homework.Lesson6;

/* Создать и заполнить массив из 10 чисел, значениями от 1 до 10 */

public class Task1 {
    public static void main(String[] args) {
        int newArray [] = new int [10];

        for (int i = 0; i < newArray.length ; i++) {
            newArray[i] = i+1;
            System.out.println(newArray[i]);
        }
    }
}
