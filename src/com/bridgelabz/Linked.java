package com.bridgelabz;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    static Node head;  //head of list
    //Node class
    static class Node {
        int data;
        Node next;

        //constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    //function to insert node at the middle of the list
    static void insertAtMid(int x) {
        //if list is empty
        if (head == null)
            head = new Node(x);
        else {
            //get a new node
            Node newNode = new Node(x);

            Node ptr = head;
            int len = 0;

            //calculate length of the linked list i.e, no.of nodes
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }
            //count the no.f nodes after which the new node is to be inserted
            int count = ((len % 2) == 0) ? (len / 2) : (len + 1) /2;
            ptr = head;

            // new node s to be inserted
            while (count-- > 1)
                ptr = ptr.next;

            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }
    // function for display linked list
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }

    //Driver program to test above
    public static void main(String[] args ) {
        //creating list
        //head = null;
        head.next = new Node(1);
        head.next.next = new Node(2);

        System.out.println("linked list before insertion:");
        display();

        int x = 3;
        insertAtMid(x);
        System.out.println("linked list adter insertion:");
        display();


       /* Iterator i = li.descendingIterator();
        System.out.println("Reversing list:");
        while (i.hasNext()) {
            System.out.println(i.next());
        } */


    }
}
