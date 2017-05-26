package part2;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

import java.util.ArrayList;

/**
 * Created by smeleyka on 25.05.17.
 */
public class Box<T extends Fruit> {
    private ArrayList<T> fruitList;
    private static float weight = 0;

    public Box() {
        this.fruitList = new ArrayList<T>();
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void getWeight(){
        float totalWeight = 0;
        for (T o : fruitList) {
            totalWeight+=o.getWeight();
        }
        System.out.println(totalWeight);
    };

    public void addFruit(T t){
        fruitList.add(t);
        weight+=t.getWeight();
    };

    public void remFruit(T t){
        fruitList.remove(t);
        weight-=t.getWeight();
    };

    public void calcWeight(){
        for (T o : fruitList) {
            weight+=o.getWeight();
        }
    }

    public void compare(){}
}
