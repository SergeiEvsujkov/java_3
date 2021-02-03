package lesson1.task1_2;

public interface IStorage <E> {

    void  add(E value);
    void  add(E value, int index);

    void  remove(int index);
    E get(int index);
    void display();
    void exchange(int i, int j);
}
