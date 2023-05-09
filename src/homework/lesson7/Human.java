package homework.lesson7;

/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, двое детей. Вывести объекты на экран.
Примечание: Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Катя, пол: женский, возраст: 55
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Human {
    private String name;
    private boolean isMale;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, boolean isMale, int age, Human father, Human mother) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", пол: " + (isMale ? "мужской" : "женский") + ", возраст: " + age;
    }

    public static void main(String[] args) {
        Human grandpa1 = new Human("Ivan", true, 55, null, null);
        Human grandpa2 = new Human("Michail", true, 65, null, null);
        Human grandma1 = new Human("Mary", false, 62, null, null);
        Human grandma2 = new Human("Minerva", false, 54, null, null);

        Human father = new Human("God", true, 99, grandpa1, grandma1);
        Human mother = new Human("Angel", false, 98, grandpa2, grandma2);

        Human child1 = new Human("Anna", true, 7, father, mother);
        Human child2 = new Human("Mike", false, 11, father, mother);

        System.out.println(grandpa1);
        System.out.println(grandma1);
        System.out.println(grandpa2);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
    }
}
