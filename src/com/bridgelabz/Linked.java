package com.bridgelabz;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail  = null;


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


    public  void display(){
        Node current = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current!= null) {
            System.out.print(current.data +" ");
            current = current.next;
        }
        System.out.println();
    }
    public void pop () {
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
    public static void main(String[] args ) {
        Linked li = new Linked();
        System.out.println("Welcome to Linked List:");
        //adds data to the list.
        li.addNode(56);
        li.addNode(30);
        li.addNode(70);

        System.out.println("Original list");
        li.display();


        li.pop();
        System.out.println("Updated list");
        li.display();

       /* Iterator i = li.descendingIterator();
        System.out.println("Reversing list:");
        while (i.hasNext()) {
            System.out.println(i.next());
        } */


    }
}
