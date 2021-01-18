package id.ten.latihan.linkedList;

public class LinkedList2 {

    public Node head=null;
    public Node tail=null;
    public int size=0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) throws Exception {
        LinkedList2 list = new LinkedList2();

        list.add(1);
        list.add(2);
        list.add(3);

        list.display();

        list.addLast(32);

        list.display();

        list.addFirst(100);

        list.display();

        list.removeFirst();

        list.display();

        list.removeLast();

        list.display();

        list.reverse();

        list.display();
    }

    private void reverse() {
        Node pointer = head;
        Node current = null;
        Node prev = null;

        while(pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = prev;
            prev = current;
            head = current;
        }
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
            Node sm2 = getNodeAt(size - 2);
            sm2.next = null;
            this.tail = sm2;
            size --;
        }


    }

    private Node getNodeAt(int index) throws Exception {
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

    private void removeFirst() {
        if(size == 0) {
            System.out.println("List is empty");
            return;
        }

        if(size == 1) {
            head = null;
            tail = null;
            size--;
        }else{
            head = head.next;
        }
    }

    private void addFirst(int i) {
        Node newNode = new Node(i);

        if(size ==0) {
            head = newNode;
            tail= newNode;

        }else{
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    private void addLast(int i) {
        add(i);
    }

    private void display() {

        if(size ==0) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while(current != null) {
            System.out.print(" "+current.data);
            current = current.next;
        }

        System.out.println();
    }

    private void add(int i) {
        Node newNode = new Node(i);

        if(size == 0) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}
