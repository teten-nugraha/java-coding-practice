package id.ten.latihan.linkedList;

import com.sun.security.jgss.GSSUtil;

public class Coba1 {

    public Node head= null;
    public Node tail= null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null; // untuk penanda tail
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void print() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(" "+current.data);
            current = current.next;
        }

    }

    public void delete(int data) {

    }

    public static void main(String[] args) {

        Coba1 list = new Coba1();

        list.add(1);
        list.add(2);
        list.add(3);

        list.print();

    }
}
