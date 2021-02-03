package lesson1.task1_2;

import java.util.List;

public class StorageGeneric <E> implements IStorage <E> {
    private  E [] data;

    public int getCurrentSize() {
        return currentSize;
    }

    private int currentSize;

    public StorageGeneric(int size){
        this.data = (E[]) new Object[size];
    }


    public void add(E value) {
        add(value, currentSize);
    }


    public void add(E value, int index) {
        data[index] = value;
        currentSize++;

    }


    public void remove(int index) {
        if (data[index] != null) {
            currentSize--;
        }
        data[index] = null;
    }


    public E get(int index) {
        return data[index];
    }


    public void display() {
        for (E datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }


    public void exchange(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
