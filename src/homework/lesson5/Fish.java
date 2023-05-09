package homework.lesson5;

public class Fish {

    private String name;
    private int age;
    private Woman owner;

    public Fish(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Woman getOwner() {
        return owner;
    }
}