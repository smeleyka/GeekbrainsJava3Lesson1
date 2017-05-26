package part1;

/**
 * Created by smeleyka on 25.05.17.
 */
public class Box<T> implements Printable{
    private T obj;
    private T name;
    private T color;


    public Box (T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
