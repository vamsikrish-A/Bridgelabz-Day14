package com.bridgelabz;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args ) {
        LinkedList<Integer> li = new LinkedList<>();
        System.out.println("Welcome to Linked List:");

        li.add(70);
        li.add(30);
        li.add(56);

        System.out.println("list sequence:" +li);

        Iterator i = li.descendingIterator();
        System.out.println("Reverse list sequence:");

        while (i.hasNext())
            System.out.println(i.next());


    }
}
