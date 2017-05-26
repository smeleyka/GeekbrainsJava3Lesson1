package part2;

/**
 * Created by smeleyka on 25.05.17.
 */
public class Main {

    public static void main(String[] args) {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();

        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();

        Box b1  = new Box();
        Box b2  = new Box();

        b1.addFruit(a1);
        b1.addFruit(a2);
        b1.addFruit(a3);

        b2.addFruit(o1);
        b2.addFruit(o2);
        b2.addFruit(o3);

        b1.getWeight();
        System.out.println(b1.getFruitList());
    }

}
