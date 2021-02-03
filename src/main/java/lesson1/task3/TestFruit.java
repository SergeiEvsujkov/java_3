package lesson1.task3;

public class TestFruit {
    public static void main(String[] args) {
        Box <Orange> box1 = new Box();
        Box <Apple> box2 = new Box();
        Box <Orange> box3 = new Box();

        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());

        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());

        box3.add(new Orange());
        box3.add(new Orange());
        box3.add(new Orange());
        box3.add(new Orange());

        box1.display();
        box2.display();
        box3.display();

        System.out.println("Коробка весит: " + box1.getWeight());
        System.out.println("Коробка весит: " + box2.getWeight());
        System.out.println("Коробка весит: " + box3.getWeight());
        System.out.println();

        System.out.println(box1.compare(box2));
        System.out.println();

        box1.toPour(box3);

        box1.display();
        box2.display();
        box3.display();

        System.out.println("Коробка весит: " + box1.getWeight());
        System.out.println("Коробка весит: " + box2.getWeight());
        System.out.println("Коробка весит: " + box3.getWeight());
    }
}
