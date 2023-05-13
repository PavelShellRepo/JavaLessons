package homework.Lesson6;

/*
Метод max(int[]array) должен находить максимальное число из элементов массива.
В выполняющем методе main выведите максимальное число в консоль.
*/

public class Task10 {
    public static void main(String[] args) {
        int[] array = {7, 3, 2, 4, 8};
        int max = max(array);
        System.out.println("Max number in array is: " + max);
    }

    public static int max(int[]array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
