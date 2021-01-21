package id.ten.latihan.linkedList;

import java.util.Objects;

public class LinkedList3 {

    private Node head;
    private Node tail;
    private int size;

    private boolean isEmpty() {
        return (size == 0);
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LinkedList3 list = new LinkedList3();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.display();

        list.addFirst(100);

        list.display();

        list.addLast(89);
        list.display();

        list.removeFirst();

        list.display();

        list.removeLast();

        list.display();

        list.reverse();

        list.display();
    }

    private void reverse() {
        checking();

        Node pointer = head;
        Node current=null;
        Node prev = null;

        while(pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = prev;
            prev = current;
            head = current;
        }
    }

    private void removeLast() {
        checking();

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            Node prevNode = getNodeAt(size - 2);
            prevNode.next = null;
            tail = prevNode;
            size--;
        }
    }

    private void checking() {
        if (isEmpty()) {
            System.out.println("Linkedlist is empty");
            return;
        }
    }

    private Node getNodeAt(int index) {
        checking();

        if (index < 0 || index >= this.size) {
            System.out.println("Invalid index");
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    private void removeFirst() {
        checking();

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }

    private void addLast(int i) {
        add(i);
    }

    private void addFirst(int value) {
        if (Objects.isNull(value)) {
            System.out.println("Value should be fill");
        }

        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;

    }

    private void display() {
        checking();
        Node current = head;

        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }

        System.out.println();
    }

    private void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

}
