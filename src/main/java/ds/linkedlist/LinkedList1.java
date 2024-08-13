package ds.linkedlist;

public class LinkedList1 {
    Node head;
    Node tail;
    int length;
    public LinkedList1(int value) {
        this.head = new Node().setValue(value).setNext(null);
        this.tail = this.head;
        this.length = 1;
    }

    public void prepend(int value){
        Node newNode = new Node().setValue(value);
        Node currentHead = this.head;
        this.head = newNode;
        this.head.setNext(currentHead);
        this.length++;
    }

    public void append(int value){
        Node newNode = new Node().setValue(value).setNext(null);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.length++;
    }

    public void printList(LinkedList1 list) {
        Node currentNode = this.head;
        while(currentNode.getNext()!=null){
            System.out.print(currentNode.getValue()+" -> ");
            currentNode = currentNode.getNext();
        }
        System.out.print(this.tail.getValue());
    }

    public void reverse(LinkedList1 list){
        Node first = list.head;
        Node second = first.getNext();
        while(second != null){
            Node temp = second.getNext();
            second.setNext(first);
            first = second;
            second = first;
        }
        this.head.setNext(null);
        System.out.println(list);
    }

    public void insert (int index, int value){
        if(index==0 || index>this.length-1){
            return;
        }
        Node currentNode = this.head;
        for(int i = 1 ; i<index; i++){
            currentNode = currentNode.getNext();
        }
        Node newNode =  new Node().setValue(value).setNext(currentNode.getNext());
        currentNode.setNext(newNode);
    }

    @Override
    public String toString() {
        return "ds.linkedlist.LinkedList1{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.reverse(list);
    }
}

class Node {
   int value;
   Node next;

    public int getValue() {
        return value;
    }

    public Node setValue(int value) {
        this.value = value;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return "ds.linkedlist.Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
