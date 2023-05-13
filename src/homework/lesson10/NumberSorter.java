package homework.lesson10;

/*
1. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам: Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
   Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Создай метод printList - он должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
   Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSorter {

    private final List<Integer> mainList;
    private final List<Integer> listDivisibleByThree;
    private final List<Integer> listDivisibleByTwo;
    private final List<Integer> listOthers;

    public NumberSorter() {
        mainList = new ArrayList<>();
        listDivisibleByThree = new ArrayList<>();
        listDivisibleByTwo = new ArrayList<>();
        listOthers = new ArrayList<>();
    }

    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            mainList.add(num);
        }
        sortNumbers();
    }

    private void sortNumbers() {
        for (int num : mainList) {
            if (num % 3 == 0 && num % 2 == 0) {
                listDivisibleByThree.add(num);
                listDivisibleByTwo.add(num);
            } else if (num % 3 == 0) {
                listDivisibleByThree.add(num);
            } else if (num % 2 == 0) {
                listDivisibleByTwo.add(num);
            } else {
                listOthers.add(num);
            }
        }
    }

    public void printList(List<Integer> list) {
        for (int num : list) {
            System.out.println(num);
        }
    }

    public void printSortedLists() {
        System.out.println("Numbers divisible by 3:");
        printList(listDivisibleByThree);
        System.out.println("Numbers divisible by 2:");
        printList(listDivisibleByTwo);
        System.out.println("Other numbers:");
        printList(listOthers);
    }

    public static void main(String[] args) {
        NumberSorter numberSorter = new NumberSorter();
        numberSorter.inputNumbers();
        numberSorter.printSortedLists();
    }
}
