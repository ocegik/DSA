package DataStructures.LinkedLists;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAt(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }
            current = current.next;
        }

        current.next = current.next.next;
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtBeginning(5);
        list.insertAt(2, 15);

        System.out.print("Linked List: ");
        list.show();

        System.out.println("Size: " + list.size());
        System.out.println("Search 20: " + list.search(20));

        list.deleteAt(2);
        System.out.print("After deletion: ");
        list.show();
    }
}
