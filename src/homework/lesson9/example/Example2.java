package homework.lesson9.example;

public class Example2<T> {
    private T instance;

    public static <T> void simpleInit(T instantiator) {
    }
    public static <T> Example2<T> init(T instantiator){
        return new Example2<T>();
    }

    public T getInstance() {
        return instance;
    }

    public void setInstance(T obj) {
        this.instance = obj;
    }
}