package homework.Lesson6;

/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию. Посчитать сумму элементов массива и вывести её на экран. */

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
