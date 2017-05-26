package part1;

import java.util.ArrayList;

/**
 * Created by smeleyka on 25.05.17.
 */
public class Main {
    public static Box<Integer> b1 ;
    public static Box<String> b2 ;
    public static  Box<String> b3 ;

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(50);
        Box<String> b2 = new Box<>("Second");
        Box<String> b3 = new Box<>("Third");

        Cat<Integer> c1 = new Cat<>(20);
        Cat<String> c2 = new Cat<>("Второй");
        Cat<String> c3 = new Cat<>("Третий");

        Box[] boxArr = {b1, b2, b3};
        Cat[] catArr = {c1, c2, c3};

        arrChange(catArr, 0, 2);

        for (Box o : boxArr) System.out.println(o.getObj());
        for (Cat o : catArr) System.out.println(o.getObj());
        System.out.println("__________________________");
        printArray(catArr);


    }


    public static <T> void arrChange(T[] arr, int a, int b) {
        if (a >= 0 & a < arr.length & b >= 0 & b < arr.length) {
            T tempVar = arr[a];
            arr[a] = arr[b];
            arr[b] = tempVar;
        } else System.out.println("Неверные входные параметры");
    }

    public static  <T> ArrayList<T> arrayToArrayList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T o : arr) arrayList.add(o);
        return arrayList;
    }

    public static  <T extends Printable> void printArray(T[] arr) {
        for (T o : arr) System.out.println(o.getObj());
    }
}
