package exercise02;

public class LinkedList<T extends Number> {
    private Node<T> head;
    private Integer size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;


        public Node(T value) {
            this.value = value;
            next = null;
        }
    }


    public void add(T t) {
        /*
        Három eset van:
            1. Linked List még üres. Lesz egy új node newValue néven, azt megadjuk a headnek és kész.
            2. Linked List pontosan 1 elem van: Van head, de a next null. Lemásolom a head-et egy currentNode-ba. A currentNode.next lesz a newNode.
            3. Linked List 1-nél több elem van: a next elem lesz a currentNode, a currentNode.next pedig a newNode.
        */

        Node<T> newNode = new Node(t);

        if(head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;

            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void remove(T t) {

        if(head == null) {
            return;
        }

        if(head.value.equals(t)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> currentNode = head;

        while(currentNode.next != null && !currentNode.next.value.equals(t)) {
            currentNode = currentNode.next;
        }

            currentNode.next = currentNode.next.next;
            size--;
    }

    public void print() {
        Node<T> currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public int indexOf(T data) {
        Node<T> currentNode = head;
        int index = 0;

        while(currentNode != null) {
            if(currentNode.value.equals(data)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }
}
