package id.ten.latihan.linkedList;

import java.util.LinkedList;

// https://www.journaldev.com/30501/linked-list-insert-delete-methods
public class LinkedList1 {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head, tail = null;
    private int size;

    public int size() {
        return this.size;
    }

    private void addLast(int i) {

        Node newNode = new Node(i);

        // checking
        if(this.size > 0) {
            tail.next = newNode;
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;

        }
        size++;
    }

    private void display() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(" "+current.data);
            current = current.next;
        }

        System.out.println();
    }

    private void removeFirst() {
        if(size == 0) {
            System.out.println("List is empty");
            return;
        }

        if(size == 1) {
            // make it null
            head = null;
            tail = null;
            size=0;
        }else{
            this.head = this.head.next;
            size--;
        }

    }

    public Node getNodeAt(int index) throws Exception {
        if(index == 0) {
            throw new Exception("LL us empty");
        }

        if(index <0 || index >= this.size) {
            throw new Exception("Invalid Index.");
        }

        Node current = head;
        for(int i=1; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    private void removeLast() throws Exception {
        if(this.size == 0) {
            System.out.println("List is empty");
            return;
        }

        if(this.size == 1) {
            head = null;
            tail = null;
            size = 0;
        }else{
            Node sm2 = getNodeAt(size -1);
            sm2.next = null;
            this.tail = sm2;
            size --;
        }
    }

    public static void main(String[] args) throws Exception {
        LinkedList1 list = new LinkedList1();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        
        list.display();

        list.removeFirst();

        list.display();

        list.removeLast();

        list.display();
    }




}
