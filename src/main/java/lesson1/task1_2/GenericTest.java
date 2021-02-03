package lesson1.task1_2;

public class GenericTest {
    public static void main(String[] args) {
        genericTest();
    }

    private static void genericTest() {
        StorageGeneric <String> strArr = new StorageGeneric<>(7);
        StorageGeneric <Integer> intArr = new StorageGeneric<>(7);
        strArr.add("A");
        strArr.add("B");
        strArr.add("C");
        strArr.add("D");
        strArr.add("E");
        strArr.display();
        strArr.exchange(0, 3);
        strArr.display();
        System.out.println("Количество не NULL значений в списке: " + strArr.getCurrentSize());
        System.out.println();

        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);
        intArr.display();
        intArr.exchange(1,4);
        intArr.remove(5);
        intArr.remove(4);
        intArr.display();
        intArr.add(6,5);
        intArr.remove(1);
        intArr.display();
        System.out.println("Количество не NULL значений в списке: " + intArr.getCurrentSize());
    }


}
