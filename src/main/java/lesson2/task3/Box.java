package lesson2.task3;

import java.util.ArrayList;

public class Box <E extends Fruit> {


    private  ArrayList <E> fruitBox;

    public Box(){
        this.fruitBox = new ArrayList<>();
    }

    public void add(E fruit) {
        this.fruitBox.add(fruit);
    }

    public void remove() {
        this.fruitBox.remove(fruitBox.size() - 1);
    }

    public void display() {
        System.out.println("В коробке лежат:");
        System.out.println(fruitBox);
        System.out.println();

    }

    public float getWeight() {
        float weightBox = 0.0f;
        for (E fruit : fruitBox) {
            weightBox = weightBox + fruit.getWeight();
        }
        return weightBox;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void toPour(Box<E> another) {
        another.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }

}
