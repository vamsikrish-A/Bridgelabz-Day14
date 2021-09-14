package com.bridgelabz;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    //Node class
    static class Node {
        int data;
        Node next;

        //constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Represent the head and tail of the linked list
    public Node head = null;
    public Node tail = null;


    //addNode() will add a new node to list
    public void addNode(int data) {
        Node newNode = new Node(data);

        //checks if te list is empty
        if (head == null) {
            //if list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    //function to insert node at the middle of the list
 /* static void insertAtMid(int data) {
        //if list is empty
        if (head == null)
            head = new Node();
        else {
            //get a new node
            Node newNode = new Node();

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
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
        System.out.println("null");
    }
    //delete first Element from the List
    public static Node pop(Node headRef) {
        if (headRef == null) {
            return null;
        }
        int result = headRef.data;
        headRef = headRef.next;
        System.out.println("the popped node is "+result);
        return headRef;
    }
    //delete last Element from the list
    public void popFromLast () {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        else {
            if(head!= tail) {
                Node current = head;
                //loop through the list till the second last element
                while (current.next != tail) {
                    current = current.next;
                }
                //Second last element will become new tail
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }
    //SearchNode will search for a given node in the list
    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //checks whether list is empty
        if (head == null) {
            System.out.println("list is empty");
        }
        else {
            while(current != null) {
                //compares node to be found with each node present in the list
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)
            System.out.println("Element present in the at the position :"+i);
        else
            System.out.print("Element is not present in the list");
    }


    //Driver program to test above
    public static void main(String[] args ) {
        /*creating list
        head = null;
        head = new Node(56);
        head.next = new Node(70); */
        Linked li = new Linked();
        System.out.println("Welcome to Linked List:");
        //adds data to the list.
        li.addNode(56);
        li.addNode(30);
        li.addNode(70);

        System.out.println("Original list");
        li.display();

        li.searchNode(30);
        //li.pop();
        //System.out.println("Updated list");
        //li.display();

       /* // input keys
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
