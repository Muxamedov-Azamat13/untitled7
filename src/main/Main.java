package main;

import main.list.GbList;
import main.list.imple.GbArrayList;
import main.list.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
//        GbList<Integer> lst = new GbArrayList<>();
//
//        lst.add(4);
//        lst.add(5);
//        lst.add(3);
//
//        System.out.println(lst);
//
//        lst.remove(2);
//        System.out.println(lst);
//        System.out.println(lst.size());

        GbList<Integer> linkedList = new LinkedList<>();

        linkedList.insertBeginning(1);
        linkedList.insertBeginning(3);
        linkedList.insertBeginning(5);
        linkedList.insertEnd(7);
        linkedList.insertEnd(2);
        linkedList.insertEnd(9);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.getElementIndex(3));
        System.out.println(linkedList.getElementIndex(4));
    }
}