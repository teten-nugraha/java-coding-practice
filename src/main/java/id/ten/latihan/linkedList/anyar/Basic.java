package id.ten.latihan.linkedList.anyar;

public class Basic {

    public Node head = null;
    public Node tail = null;
    public int size=0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
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

        size++;
    }

    public void print() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node current = head ;
        while(current != null) {
            System.out.print(" "+current.data);
            current = current.next;
        }
    }

    public void removeLast() throws  Exception {
        if(this.size == 0) {
            System.out.println("List empty");
            return;
        }

        if(this.size == 1){
            head = null;
            tail= null;
            size=0;
        }else{
            Node sm2 = getNodeAt(size-1);
            sm2.next = null;
            tail = sm2;
            size--;

        }
    }

    private Node getNodeAt(int index)  {
        if(index == 0) {
            System.out.println("List empty");
        }

        if(index < 0 || index >= size) {
            System.out.println("Inalid index");
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;

        if(size ==0){
            head = newNode;
            tail = newNode;
            size++;
        }else{
            head = newNode;
            size++;
        }
    }

    public void removeFirst() {

        if(this.size ==0) {
            System.out.println("Lis is empty");
        }

        head = head.next;

    }


    public void removeAt(int index) throws Exception {
        if (index == 0) {
            removeFirst();
        }else if(index == size){
            removeLast();
        }else{
            Node prevTarget  =getNodeAt(index-1);
            Node target = prevTarget.next;
            Node nextTarget = target.next;

            prevTarget.next = nextTarget;
            size--;
        }
    }


    public static void main(String[] args) throws Exception {
        Basic basic = new Basic();

        basic.add(1);
        basic.add(2);
        basic.add(3);

        basic.print();

        basic.removeLast();
        System.out.println("");

        basic.print();

        basic.addFirst(100);

        System.out.println("");

        basic.print();

        basic.removeFirst();
        System.out.println();

        basic.print();

        basic.addFirst(23);
        System.out.println();

        basic.print();

        basic.removeAt(0);

        System.out.println();

        basic.print();
    }
}
