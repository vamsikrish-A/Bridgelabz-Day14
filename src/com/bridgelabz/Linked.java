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
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    //function to insert node at the middle of the list
  /*  static void insertAtMid(int x) {
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
    }*/
    // function for display linked list
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node pop(Node headRef) {
        if (headRef == null) {
            return null;
        }
        int result = headRef.data;
        headRef = headRef.next;
        System.out.println("the popped node is "+result);
        return headRef;
    }

    //Driver program to test above
    public static void main(String[] args ) {
        /*creating list
        head = null;
        head = new Node(56);
        head.next = new Node(70); */

        // input keys
        int[] keys = {56,30,70};

        //point to the head node of the linked list
        Node head = null;

        //construct a linked list
        for(int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        head = pop(head);


        //System.out.println("linked list before insertion:");
        display(head);

      /*  int x = 30;
        insertAtMid(x);
        System.out.println("linked list after insertion:");
        display(); */


       /* Iterator i = li.descendingIterator();
        System.out.println("Reversing list:");
        while (i.hasNext()) {
            System.out.println(i.next());
        } */


    }
}
