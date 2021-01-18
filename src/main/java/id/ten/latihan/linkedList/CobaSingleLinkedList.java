package id.ten.latihan.linkedList;

public class CobaSingleLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data  = data;
            this.next = null;
        }
    }

    // represent the head and tail of the single linked list
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }else{
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;

        }
    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CobaSingleLinkedList list = new CobaSingleLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        list.display();

    }
}
