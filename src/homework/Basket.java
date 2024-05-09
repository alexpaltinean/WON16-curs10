package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Basket {
    private List<String> fruits;

    public Basket() {
        this.fruits = new ArrayList<>();
    }

    public boolean find(String searchedFruit) {
        return fruits.contains(searchedFruit);
    }

    public boolean remove(String fruitToBeRemoved) {
        return fruits.remove(fruitToBeRemoved);
    }

    public Collection<String> distinct() {
        return Set.copyOf(fruits);
    }

    public void add(String fruitToBeAdded) {
        if (fruitToBeAdded != null) {
            fruits.add(fruitToBeAdded);
        }
    }

    public static void main(String[] args) {
        Basket b = new Basket();
        b.add("banana");
        b.add(null);
        System.out.println(b.distinct());
    }
}
