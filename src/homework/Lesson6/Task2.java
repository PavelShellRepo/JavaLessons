package homework.Lesson6;

/* Создать и заполнить массив из 10 чисел, значениями от 10 до 1 */

public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
            System.out.println(arr[i]);
        }
    }
}
