package homework.lesson10;

/*
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметры с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.

Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private int tailLength;

    public Cat(String name, int age, double weight, int tailLength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
    }

    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter cat name (empty to exit): ");
            String name = input.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.print("Enter cat age: ");
            int age = input.nextInt();
            System.out.print("Enter cat weight: ");
            double weight = input.nextDouble();
            System.out.print("Enter cat tail length: ");
            int tailLength = input.nextInt();

            Cat cat = new Cat(name, age, weight, tailLength);
            catList.add(cat);
            input.nextLine();
        }

        System.out.println("Cat list:");
        for (Cat cat : catList) {
            System.out.println(cat.toString());
        }
    }
}


