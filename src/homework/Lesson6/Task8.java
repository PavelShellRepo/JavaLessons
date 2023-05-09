package homework.Lesson6;

/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию. Найти минимальный элемент в массиве и вывести его в консоль. */

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,1};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
           if (arr[i] < min){
               min = arr[i];
           }
        }
        System.out.println(min);
    }
}
