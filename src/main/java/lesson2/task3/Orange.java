package lesson2.task3;

public class Orange extends Fruit{

    private String name = "Апельсин";
    private float weight = 1.5f;

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

}
