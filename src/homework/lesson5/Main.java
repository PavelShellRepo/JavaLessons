package homework.lesson5;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Kate", 30);
        Cat cat = new Cat("Tom", 5, woman);
        Dog dog = new Dog("Rex", 3, woman);
        Fish fish = new Fish("Nemo", 1, woman);

        System.out.println(cat.getName() + " is owned by " + cat.getOwner().getName());
        System.out.println(dog.getName() + " is owned by " + dog.getOwner().getName());
        System.out.println(fish.getName() + " is owned by " + fish.getOwner().getName());
    }
}
