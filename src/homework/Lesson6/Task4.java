package homework.Lesson6;

/* Создать и заполнить массив из 10 чисел, значениями от 29 до 20 */

public class Task4 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 29-i;
            System.out.println(arr[i]);
        }
    }
}
