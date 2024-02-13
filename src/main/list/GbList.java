package main.list;

public interface GbList<T> extends Iterable<T>{
//    void add(T elem);
//    void remove(int index);

//    T get(int index);
    int size();

    void insertBeginning(T elem);
    void insertEnd(T elem);
    T getElementIndex(int index);

}
