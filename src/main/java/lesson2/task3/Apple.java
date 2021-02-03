package lesson2.task3;

public class Apple extends Fruit{

    private String name = "Яблоко";
    private float weight = 1.0f;

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
