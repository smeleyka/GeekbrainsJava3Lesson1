package part1;

/**
 * Created by smeleyka on 25.05.17.
 */
public class Cat<T> implements Printable{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Cat(T obj) {
        this.obj = obj;
    }
}

