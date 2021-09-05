package com.bridgelabz;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args ) {
        LinkedList<Integer> li = new LinkedList<>();
        System.out.println("Welcome to Linked List:");

        li.add(56);

        System.out.println("list:"+li);
        li.addLast(30);
        li.addLast(70);

        System.out.println("new list:"+li);

       /* Iterator i = li.descendingIterator();
        System.out.println("Reversing list:");
        while (i.hasNext()) {
            System.out.println(i.next());
        } */


    }
}
