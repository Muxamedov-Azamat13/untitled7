package main.list;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] value;
    private int index;

    public ArrayIterator(E[] value) {
        this.value = value;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < value.length;
    }

    @Override
    public E next() {
        return value[index++];
    }
}
