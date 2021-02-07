package tcore_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T fruit) {
        this.items.add(fruit);
    }

    public void add(T... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public ArrayList<T> getItems() {
        return new ArrayList<T>(items);
    }

    public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (T item : items) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box<T> box) {
        if (this.getWeight() == box.getWeight())
            return true;
        else return false;
        //        return this.getWeight() == box.getWeight();
    }

    public void takeAllFromBox(Box<T> other) {
        this.items.addAll(other.getItems());
        other.removeAll();
    }

    public void removeAll() {
        items.clear();
    }
}
