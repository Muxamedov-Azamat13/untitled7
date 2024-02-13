package main.list.imple;

import main.list.ArrayIterator;
import main.list.GbList;

import java.util.Iterator;

public class GbArrayList<T> implements GbList<T> {
    private int size;
    private T[] value;
    private int capacity;

    @SuppressWarnings("unchecked")

    public GbArrayList() {
        this.size = 0;
        this.capacity = 2;
        try {
            this.value = (T[]) new Object[capacity];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")

    private void addCapacity() {
        try {
            capacity = capacity * 2;
            T[] temp = (T[]) new Object[capacity];
            System.arraycopy(value,0,temp,0,value.length);
            value = temp;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

//    @Override
//    public void add(T elem) {
//        if (size == capacity){
//            addCapacity();
//        }
//        value[size++] = elem;
//    }
//
//    @Override
//    public void remove(int index) {
//        capacity = capacity - 1;
//        T[] temp = (T[]) new Object[capacity];
//        System.arraycopy(value,0,temp,0,index);
//        int amountElementsAfterIndex = value.length - index - 1;
//        System.arraycopy(value,index + 1,temp,index,amountElementsAfterIndex);
//        value = temp;
//        size--;
//    }

//    @Override
//    public T get(int index) {
//        return value[index];
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insertBeginning(T elem) {

    }

    @Override
    public void insertEnd(T elem) {

    }

    @Override
    public T getElementIndex(int index) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(value);
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int index = 0;
        while (index != size) {
            builder.append(value[index]).append(", ");
            index++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
